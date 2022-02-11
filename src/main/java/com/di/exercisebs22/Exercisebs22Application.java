package com.di.exercisebs22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exercisebs22Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercisebs22Application.class, args);
	}

	@Bean
	ListaCiudadesService getListaCiudadesService()
	{
		return new ListaCiudadesServiceImp();
	}
}
