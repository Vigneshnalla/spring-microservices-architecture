package com.vignesh.loans;

import com.vignesh.loans.dto.LoansContactInfoDto;
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
/*@ComponentScans({ @ComponentScan("com.vignesh.loans.controller") })
@EnableJpaRepositories("com.vignesh.loans.repository")
@EntityScan("com.vignesh.loans.model")*/
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "VigneshBank Loans microservice REST API Documentation",
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
				description = "VigneshBank Loans microservice REST API Documentation",
				url = "vigneshdev.online/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
