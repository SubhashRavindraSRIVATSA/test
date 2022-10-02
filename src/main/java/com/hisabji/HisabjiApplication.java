package com.hisabji;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HisabjiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HisabjiApplication.class, args);
	}
	
	//@Autowired
	//private MerchantsRepository merchantsRepository;

	@Override
	public void run(String... args) throws Exception {
		
	
	}

}
