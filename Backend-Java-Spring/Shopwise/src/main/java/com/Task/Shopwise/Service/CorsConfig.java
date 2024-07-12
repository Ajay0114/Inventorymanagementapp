package com.Task.Shopwise.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("http://a6641cda68db548f88fbd196daf144c6-1534474613.ap-south-1.elb.amazonaws.com/"); // frontendapploadbalancer
		config.addAllowedOrigin("http://a05df81c6e26842219a1cc30bbb95ede-660146148.ap-south-1.elb.amazonaws.com:9090"); // manfacturer
																														// app
																														// load
																														// balancer
		config.addAllowedMethod("*");
		config.addAllowedHeader("*");

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);

		return source;
	}

	@Bean
	public CorsFilter corsFilter() {
		return new CorsFilter(corsConfigurationSource());
	}

}
