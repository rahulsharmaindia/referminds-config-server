package com.referminds.refermindsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RefermindsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefermindsConfigServerApplication.class, args);
	}
}
