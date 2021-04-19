package com.topsafder.easySpringSkillBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableConfigurationProperties
@SpringBootApplication
//@ComponentScan(basePackages = "com.topsafder.controllers.*, com.topsafder.service.*")
// scan JPA entities
//@EntityScan(basePackages = {"com.topsafder.model"})
//@EnableJpaRepositories(basePackages = "com.topsafder.repository.*")
public class EasySpringSkillBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasySpringSkillBuilderApplication.class, args);
	}

}
