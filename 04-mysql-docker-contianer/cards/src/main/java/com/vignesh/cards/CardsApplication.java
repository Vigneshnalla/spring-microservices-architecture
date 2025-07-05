package com.vignesh.cards;

import com.vignesh.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.vignesh.cards.controller") })
@EnableJpaRepositories("com.vignesh.cards.repository")
@EntityScan("com.vignesh.cards.model")*/
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "VigneshBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Vignesh Nalla",
						email = "vigneshnalla999@gmail.com",
						url = "vigneshdev.online"
				),
				license = @License(
						name = "Apache 2.0",
						url = "vigneshdev.online"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "VigneshBank Cards microservice REST API Documentation",
				url = "vigneshdev.online/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
