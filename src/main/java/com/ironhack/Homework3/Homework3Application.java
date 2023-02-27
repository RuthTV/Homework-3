package com.ironhack.Homework3;

import com.ironhack.Homework3.creatingObjects.CRMMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("!test")
public class Homework3Application implements CommandLineRunner {

	@Autowired
	CRMMenu crmMenu;

//	@Value("#{new Boolean('${application.test}')}")
//	private Boolean applicationTest;

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Homework3Application.class, args);
	}

	@Override
	public void run(String... args) throws InterruptedException {
//		if (!applicationTest) {
			crmMenu.menu();
//		}
	}
}

