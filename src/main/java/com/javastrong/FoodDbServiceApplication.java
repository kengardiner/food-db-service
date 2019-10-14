package com.javastrong;

import com.javastrong.model.Food;
import com.javastrong.repositories.FoodRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoodDbServiceApplication {
	private static final Logger log = LoggerFactory.getLogger(FoodDbServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FoodDbServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(FoodRepository repository) {
		return (args) -> {
			// save a few foods
			repository.save(new Food("Chinese", "General TSO", 50, 5));
			repository.save(new Food("Mexican", "Las Palmas Burrito", 30, 4));
			repository.save(new Food("Pizza", "Kozy's Chicken BBQ", 20, 3));
			repository.save(new Food("American", "Kozy Burger", 25, 4));
			repository.save(new Food("Thai", "Thai Fresh Rolls", 15, 3));
		};
	}}
