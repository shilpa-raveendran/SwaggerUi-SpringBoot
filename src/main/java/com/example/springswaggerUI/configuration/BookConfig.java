package com.example.springswaggerUI.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class BookConfig {

	Contact contact = new Contact("Shilpa", "www.abc.com",
			"abc@xyz.com");

	List<VendorExtension> vendorExtensions = new ArrayList<>();

	ApiInfo apiInfo = new ApiInfo("Book Spring RESTful Web Service documentation",
			"This pages documents Books app RESTful Web Service endpoints", "1.0",
			"http://www.abc.com/service.html", contact, "Apache 2.0",
			"http://www.apache.org/licenses/LICENSE-2.0", vendorExtensions);

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

}
