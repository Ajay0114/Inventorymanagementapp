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
		config.addAllowedOrigin("http://a71faa344a6bb4582a419d323f9d429d-780329519.ap-south-1.elb.amazonaws.com/"); // frontendapploadbalancer
		config.addAllowedOrigin("http://a42b35b7d12eb4da8ae0d9193153afb2-622423951.ap-south-1.elb.amazonaws.com:9090"); // manfacturer
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
