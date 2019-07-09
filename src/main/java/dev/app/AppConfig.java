package dev.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"dev.presentation", "dev.service"})
public class AppConfig {
	
	@Bean
	public EntityManagerFactory emf() {
		return Persistence.createEntityManagerFactory("demo-jpa");
	}

}
