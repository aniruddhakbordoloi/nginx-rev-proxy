package com.nginx.revproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NginxReverseProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NginxReverseProxyApplication.class, args);
	}

}
