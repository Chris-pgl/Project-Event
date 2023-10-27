package com.example.TicketUniverse;

import com.example.TicketUniverse.security.auth.AuthentificationService;
import com.example.TicketUniverse.security.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static com.example.TicketUniverse.security.user.Role.ADMIN;
import static com.example.TicketUniverse.security.user.Role.MANAGER;

@SpringBootApplication(scanBasePackages = "com.example.TicketUniverse")
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class TicketUniverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketUniverseApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthentificationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

		};
	}
}
