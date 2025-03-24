package com.anna.Cardapio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "com.anna.Cardapio")
public class CardapioDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardapioDigitalApplication.class, args);
	}

}
