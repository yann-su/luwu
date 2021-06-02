package com.github.backbook.luwu;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class LuwuApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(LuwuApplication.class);
        Environment environment = application.run(args).getEnvironment();
        //添加注解用于,标识
        log.info("spring boot started");
        log.info("url:\t http://localhost:{}",environment.getProperty("server.port"));
    }

}