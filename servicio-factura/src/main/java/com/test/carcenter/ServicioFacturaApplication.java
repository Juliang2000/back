package com.test.carcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({
	"com.test.common.cliente.model",
	"com.test.common.repuesto.model",
	"com.test.carcenter.model"
})
@EnableEurekaClient
public class ServicioFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioFacturaApplication.class, args);
	}

}
