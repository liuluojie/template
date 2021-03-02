package com.liuluojie.template.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Lljieeeeee
 * @date 2021/3/2 16:35
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 *
 *
 * @EnableSwagger2 开启swagger注解
 * @Configuration  将当前类标记为spring boot配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("网站-登录测试API文档")
                .description("本文档描述了登录测试API接口定义")
                .version("1.0")
                .contact(new Contact("java", "https://lljieeeeee.top", "2015743127@qq.com"))
                .build();
    }
}
