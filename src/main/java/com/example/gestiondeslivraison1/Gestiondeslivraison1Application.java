package com.example.gestiondeslivraison1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class Gestiondeslivraison1Application {

	public static void main(String[] args) {
		SpringApplication.run(Gestiondeslivraison1Application.class, args);
	}




		@Bean
		public CorsFilter corsFilter() {
			CorsConfiguration corsConfiguration = new CorsConfiguration();
			corsConfiguration.setAllowCredentials(true);
			corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
			corsConfiguration.setAllowedHeaders(Arrays.asList("origin", "Access-control-Aloow-origin", "content-type",
					"Accept", " Authorization ", "Origin,Accept", "X-Request-With",
					"Access-Control;-Request-Method", "Access-control-Request-Headers"));
			corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin", "Access-Control-Credentials"));
			corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
			UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
			urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);

			return new CorsFilter(urlBasedCorsConfigurationSource);



		}}

}