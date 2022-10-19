# SimpleJavaDemo
Java project
This project is a simple Java Application to use in demos, upskilling programs, training, etc. In this particular project you will find different setup project in each branch.

## Branch feature/springdoc-swagger-ui
In that branch you will find the same code as feature/open-api-generator, but with the **springdoc** dependency, that automaticly creates Swagger UI from the clases in the project that has *@RestController* anotation.

### Springdoc dependency
In the pom file the dependency is add as:

``` XML
<dependency>
  <groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-ui</artifactId>
	<version>1.6.4</version>
</dependency> 
```
Then when the application run, the OpenAPI descriptions will be available at the path /v3/api-docs by default. As this project is set to run in the 7030:

http://localhost:7030/v3/api-docs/

To use a custom path, add the follow entry in the application.properties file:

springdoc.api-docs.path=/api-docs

Now to access the docs use:

http://localhost:7030/api-docs/

The OpenAPI definitions are in JSON format by default. For yaml format, use:

http://localhost:7030/api-docs.yaml

The springdoc-openapi dependency already includes Swagger UI, so simply access the API documentation at:

http://localhost:7030/swagger-ui.html

For customize the path of API documentation. Add the follow entry in the application.properties file:

springdoc.swagger-ui.path=/swagger-ui-custom.html

Now the API documentation will be available at http://localhost:7030/swagger-ui-custom.html.
