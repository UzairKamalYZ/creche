package be.techfix.creche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(value = "be.techfix.*")
@EntityScan(value = "be.techfix")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
