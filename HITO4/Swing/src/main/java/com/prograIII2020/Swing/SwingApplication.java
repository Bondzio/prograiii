package com.prograIII2020.Swing;

import com.prograIII2020.Swing.REPOSITORY.ButtonRepository;
import com.prograIII2020.Swing.SERVICE.AlphabetService;
import com.prograIII2020.Swing.SERVICE.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SwingApplication {
	@Autowired
	private ButtonService buttonService;
	@Autowired
	private AlphabetService alphabetService;

	public static void main(String[] args) {
		SpringApplicationBuilder springApp = new SpringApplicationBuilder(SwingApplication.class);
		springApp.headless(false);
		springApp.run(args);
	}

	@PostConstruct
	public void init() {
		buttonService.saveData();
		alphabetService.saveData();
	}
}
