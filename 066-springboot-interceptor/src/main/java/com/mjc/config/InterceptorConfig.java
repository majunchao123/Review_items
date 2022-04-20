package com.mjc.config;

import com.mjc.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:InterceptorConfig
 * Package:com.mjc.config
 * Description: 描述信息
 *
 * @date:2022/4/18 15:30
 * @author:白白白
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/user/*").excludePathPatterns("/user/login.do","/user/error");
    }
}
