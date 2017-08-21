package research.and.development.CircuitBreaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import research.and.development.CircuitBreaker.service.RestClient;

@SpringBootApplication
@EnableCircuitBreaker
public class HystrixApplication{

	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}

}
