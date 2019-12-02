package tn.rnu.isetch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Tp2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp2EurekaServerApplication.class, args);
	}

}
