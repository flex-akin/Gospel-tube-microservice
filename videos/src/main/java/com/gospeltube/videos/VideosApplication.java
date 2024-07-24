package com.gospeltube.videos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class VideosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideosApplication.class, args);
	}

}
