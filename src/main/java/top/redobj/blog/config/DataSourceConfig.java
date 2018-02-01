package top.redobj.blog.config;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.Properties;

@Configuration
@MapperScan("top.redobj.blog.dao")
@PropertySource("classpath:dbConfig.properties")
public class DataSourceConfig {
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.driverClass}")
    private String jdbcClass;
    @Value("${jdbc.user}")
    private String jdbcUser;
    @Value("${jdbc.password}")
    private String jdbcPwd;

    @Bean
    public ComboPooledDataSource dataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl(jdbcUrl);
        try {
            dataSource.setDriverClass(jdbcClass);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setTestConnectionOnCheckin(false);
        dataSource.setTestConnectionOnCheckout(true);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(jdbcPwd);
        return dataSource;
    }

    @Bean
    public PageInterceptor pageInterceptor(){
        PageInterceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("reasonable","true");
        interceptor.setProperties(properties);
        return interceptor;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());
        try {
            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Interceptor[] plugins =  new Interceptor[]{pageInterceptor()};
        bean.setPlugins(plugins);
        return bean;
    }

}
