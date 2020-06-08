package com.RCS.DictionaryH4EX;

import com.RCS.DictionaryH4EX.SERVICE.AlphabetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DictionaryH4ExApplication {
//	@Autowired
//	private DictionaryService dictionaryService;
	@Autowired
	private AlphabetService alphabetService;

	public static void main(String[] args) {
		SpringApplicationBuilder sprigApp = new SpringApplicationBuilder(DictionaryH4ExApplication.class);
		sprigApp.headless(false);
		sprigApp.run(args);
	}

	@PostConstruct
	public void init() {
//		dictionaryService.saveData();
		alphabetService.saveData();
	}
}

