package com.minio;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableSwaggerBootstrapUI
@SpringBootApplication
@EnableWebMvc
@MapperScan("com.minio.mappers")
@Slf4j
public class MinioDemoApplication {

    public static void main(String[] args) {
        log.warn("str");
        SpringApplication.run(MinioDemoApplication.class, args);
    }

}
