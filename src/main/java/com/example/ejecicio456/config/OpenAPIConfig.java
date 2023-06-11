package com.example.ejecicio456.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * @ acceso: http://localhost:8081/swagger-ui/index.html
 */
@OpenAPIDefinition(info = @Info(
        title = "LaptopAPIOpenBootcam",
        version = "1.0"
))

public class OpenAPIConfig {

}
//La version Swagger2 de Springfox está obsoleta para la versión 3 de Spring-boot.

    /*package com.example.ejecicio456.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiDetails(){
        return new ApiInfo("Spring Boot Book API REST",
                "Library Api rest docs",
                "1.0",
                "http://www.google.com",
                new Contact("Hector", "http://www.google.com", "hector@example.com"),
                "MIT",
                "http://www.google.com",
                Collections.emptyList());
    }
}
*/