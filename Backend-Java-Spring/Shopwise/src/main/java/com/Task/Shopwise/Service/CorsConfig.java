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
		config.addAllowedOrigin("http://ad8a995497eee40fbbd2551e5c7b742c-160031336.ap-south-1.elb.amazonaws.com/"); // frontendapploadbalancer
		config.addAllowedOrigin("http://ab9ca4869dd1d433eb33128c208bbfa7-762043547.ap-south-1.elb.amazonaws.com:9090"); // manfacturer
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
