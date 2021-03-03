package in.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Day3EurekaClientService2Application {

	public static void main(String[] args) {
		SpringApplication.run(Day3EurekaClientService2Application.class, args);
	}

}
