package cl.zenta.stackbio.stack.configuration;

import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import cl.zenta.stackbio.stack.security.*;

public class WebConfig implements WebMvcConfigurer {

	/*
    Filter CORS
     */

    @Bean
    public FilterRegistrationBean<CorsFilter> urlCorsFilter() {
        FilterRegistrationBean<CorsFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CorsFilter());
        registration.addUrlPatterns("/*");
        registration.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
                DispatcherType.INCLUDE, DispatcherType.ASYNC, DispatcherType.ERROR));
        registration.setName("corsFilter");
        registration.setOrder(1);
        return registration;
    }

}
