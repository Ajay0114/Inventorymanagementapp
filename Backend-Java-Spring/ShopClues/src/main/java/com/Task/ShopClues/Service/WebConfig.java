package com.Task.ShopClues.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://www.ecomcloudconnect.com",
                                "http://a93268e588231434fa395cf451a6974e-1396132218.ap-south-1.elb.amazonaws.com",
                                "http://ab0353c9b218a4f43be141192f39a38e-1175769183.ap-south-1.elb.amazonaws.com:9090")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*");
            }
        };
    }
}
