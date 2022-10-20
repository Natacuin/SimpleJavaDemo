package com.example.mvnprg.config;

import com.google.common.base.Predicates;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Profile({"default", "ist", "uat"})
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
    	 return new Docket(DocumentationType.SWAGGER_2)
                 .useDefaultResponseMessages(false)
                 .groupName("com.example.mvnprg.openapi.api")
                 .apiInfo(this.apiInfo())
                 .select()                 
                 .paths(PathSelectors.any())
                 .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                 .build()
                 //.directModelSubstitute(Pageable.class, SwaggerPageableRequest.class)
                 ;
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("First Swagger API")
                .description("First Swagger Project")
                .termsOfServiceUrl("https://first-swagger.com/terms/")
                .contact(
                        new Contact(
                                "First Swagger Project",
                                "https://first-swagger.com/docs/",
                                "")
                        )
                .version("1.0.6")
                .build();
    }
}
