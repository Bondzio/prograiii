package com.RCVS.TareaFinH4;

import com.RCVS.TareaFinH4.SERVICE.AlphabetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TareaFinH4Application {
	@Autowired
	private AlphabetService alphabetService;

	public static void main(String[] args) {
		SpringApplicationBuilder springApp = new SpringApplicationBuilder(TareaFinH4Application.class);
		springApp.headless(false);
		springApp.run(args);
	}

	@PostConstruct
	public void ini() {
		alphabetService.SaveData();
	}

}
