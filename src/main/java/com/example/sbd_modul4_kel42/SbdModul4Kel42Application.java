package com.example.sbd_modul4_kel42;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class SbdModul4Kel42Application {

	public static void main(String[] args) {
		SpringApplication.run(SbdModul4Kel42Application.class, args);
	}

}
