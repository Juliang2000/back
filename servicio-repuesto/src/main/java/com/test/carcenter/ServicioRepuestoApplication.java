package com.test.carcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({
	"com.test.common.repuesto.model"
})
@EnableEurekaClient
public class ServicioRepuestoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioRepuestoApplication.class, args);
	}

}
