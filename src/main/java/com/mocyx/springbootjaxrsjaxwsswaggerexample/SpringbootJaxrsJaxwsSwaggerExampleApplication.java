package com.mocyx.springbootjaxrsjaxwsswaggerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.mocyx.springbootjaxrsjaxwsswaggerexample"})
@EnableSwagger2
public class SpringbootJaxrsJaxwsSwaggerExampleApplication {

	public static void main(String[] args) {




		SpringApplication.run(SpringbootJaxrsJaxwsSwaggerExampleApplication.class, args);
	}

}
