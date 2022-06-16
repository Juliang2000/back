package com.test.carcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication@EntityScan({
	"com.test.common.mecanico.model",
})
@EnableEurekaClient
public class ServicioMecanicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioMecanicoApplication.class, args);
	}

}
