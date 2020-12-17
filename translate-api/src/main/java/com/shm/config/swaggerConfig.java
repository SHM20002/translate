package com.shm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class swaggerConfig {

    @Bean
    public ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("小明", "", "862924968@qq.com");
        return new ApiInfo(
                "SwaggerAPI文档",
                "小明学长",
                "1.0",
                "urn:tos",
                contact,
                null,
                null,
                new ArrayList<VendorExtension>());
    }
}
