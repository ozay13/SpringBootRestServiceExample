package com.obs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EntityScan("com.obs.model")
@ComponentScan("com.obs.*")
public class OgrenciBilgiSistemiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(OgrenciBilgiSistemiApplication.class, args);
	}
}
