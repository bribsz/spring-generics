package genericsplusspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// repository -> service
// controller chama o service

@SpringBootApplication
public class SpringGenericsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGenericsApplication.class, args);
	}

}
