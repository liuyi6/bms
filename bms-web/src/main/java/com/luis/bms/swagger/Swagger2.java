package com.luis.bms.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	
//	@Value("${swaggeer.ui.enable:false}")
//	private boolean externallyConfiguredFlag;
//	
//	@Value("${swaggeer.ui.basePackage:com.luis}")
//	private String basePackage;
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.luis"))  // 选择扫描路径和api会生成document
                .paths(PathSelectors.any())
                .build()/*.enable(externallyConfiguredFlag)*/;
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("后台管理系统API接口文档")
				.description("提供RESTful APIS")
				.version("v1.0")
				.build();
	}
}
