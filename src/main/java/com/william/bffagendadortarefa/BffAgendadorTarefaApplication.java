package com.william.bffagendadortarefa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BffAgendadorTarefaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffAgendadorTarefaApplication.class, args);
	}

}
