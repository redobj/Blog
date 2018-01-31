package top.redobj.blog.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@Import(DataSourceConfig.class)
@ComponentScan(value = "top.redobj.blog",excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
public class SpringContextConfig {

}
