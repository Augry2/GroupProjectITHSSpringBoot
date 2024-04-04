package com.example.springbootprojektiths.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentationConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()

                .info(new Info()
                        .title("SpringbootProjektIths API")
                        . version("1.0")
                        .description("This is the API documentation for the project"));
    }
}
