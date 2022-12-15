package com.admin.admineureka;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminEurekaApplication.class, args);
	}

}
