package squash.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("squash")
@EntityScan("squash.entities")
@EnableJpaRepositories("squash.persistence")
public class SquashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquashApplication.class, args);
	}
}
