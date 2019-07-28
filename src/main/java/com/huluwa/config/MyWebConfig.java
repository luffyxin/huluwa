//package com.huluwa.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @Author wuwenjie
// * @Date 2019/7/28 14:39
// * @Version 1.0
// **/
//@Configuration
//public class MyWebConfig implements WebMvcConfigurer {
//
////    /**
////     * 视图控制器
////     *
////     * @param registry
////     */
////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/").setViewName("login");
////        registry.addViewController("/login.html").setViewName("login");
////    }
//
////    /**
////     * 资源处理器
////     *
////     * @param registry
////     */
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
////    }
//
////    /**
////     * 过滤器
////     *
////     * @param registry
////     */
////    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
////                .excludePathPatterns("/", "/login.html", "/admin/login", "static/css/", "static/js/", "static/img/", "static/ico/");
////    }
//
//
//}
