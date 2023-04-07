package com.users_car;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.users_car.*")
@OpenAPIDefinition(info = @Info(title = "users-car API", version = "1.0"), servers = @Server(url = "${swagger.serverBaseUrl}"))
@SecurityScheme(name = "users-car", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class UsersCarApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersCarApplication.class, args);
    }

}
