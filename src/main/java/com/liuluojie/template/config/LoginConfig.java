package com.liuluojie.template.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lljieeeeee
 * @date 2021/3/2 16:34
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
@Configuration
@MapperScan("com.liuluojie.rental.mapper")
public class LoginConfig {

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

}
