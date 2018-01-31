package top.redobj.blog.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BlogInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringContextConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DispatcherConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
