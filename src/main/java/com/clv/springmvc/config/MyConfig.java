package com.clv.springmvc.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.clv.springmvc")
public class MyConfig {
	
	@Bean
	public EntityManager getEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Manoj");
		return factory.createEntityManager();
	}
}
