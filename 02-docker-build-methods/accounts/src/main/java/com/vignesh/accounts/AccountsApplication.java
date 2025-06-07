package com.vignesh.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/*@ComponentScans({ @ComponentScan("com.vignesh.accounts.controller") })
@EnableJpaRepositories("com.vignesh.accounts.repository")
@EntityScan("com.vignesh.accounts.model")*/

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") // Enables JPA auditing and uses the specified AuditorAware bean
@OpenAPIDefinition(
    info = @Info(
        title = "Accounts Microservice API",
        description = "REST API documentation for VigneshBank Accounts Microservice",
        version = "v1.0",
        contact = @Contact(
            name = "Vignesh Nalla",
            email = "vigneshnalla999@gmail.com",
            url = "https://vigneshdev.online"
        ),
        license = @License(
            name = "Apache 2.0",
            url = "https://vigneshdev.online"
        )
    ),
    externalDocs = @ExternalDocumentation(
        description = "More about the Accounts microservice API",
        url = "https://vigneshdev.online/swagger-ui.html"
    )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }
}
