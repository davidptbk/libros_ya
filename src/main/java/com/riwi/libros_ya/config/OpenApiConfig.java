package com.riwi.libros_ya.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * Configuracion de swagger
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Api to config of workshop 01 library", version = "1.0", description = "Api documentation of workshop1 David Pineda"))
public class OpenApiConfig {
    
}
