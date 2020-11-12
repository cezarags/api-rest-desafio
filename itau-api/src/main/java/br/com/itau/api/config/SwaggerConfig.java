package br.com.itau.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
    public Docket transferenciaapi() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.basePackage("br.com.itau.api.controller")) // Caminho do pacote com todas as classes.
          .paths(PathSelectors.any())                         // Diretorio padrão
          .build()
          .apiInfo(metaInfo());                                        //Armazenando no objeto informaçoes do desenvolvedor    
    }

    private ApiInfo metaInfo(){
    	return new ApiInfoBuilder()
    	.title("Api Rest transfêrencia")
    	.description("API Rest  para transfêrencia de valores, desenvolvida para teste de lógica de programação.")
    	.version("1.0")
    	.contact(contact())
    	.build();
    	}
    	private Contact contact(){
    	return new Contact("Cezar Augusto", "cezar.ags@icloud.com",
    	"https://github.com/cezarags/api-rest-desafio");
    	}

}
