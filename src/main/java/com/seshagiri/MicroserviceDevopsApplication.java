package com.seshagiri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.seshagiri.entity.ProductEntity;
import com.seshagiri.repo.ProductRepository;

//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2()
public class MicroserviceDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDevopsApplication.class);
	}
	

	@Bean
	public CommandLineRunner sampleData(ProductRepository productRepository) {
		return (args) -> {
			productRepository.save(new ProductEntity(1, "Real Me", "Mobile", 15000));
			productRepository.save(new ProductEntity(2, "Real Me", "Mobile", 15000));
			productRepository.save(new ProductEntity(3, "Real Me", "Mobile", 15000));
		};
	}
	
	/*

	 @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.seshagiri")).build();
	   }
	*/

}
