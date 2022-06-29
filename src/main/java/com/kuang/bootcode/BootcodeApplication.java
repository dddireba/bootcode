package com.kuang.bootcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootcodeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BootcodeApplication.class, args);

        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        System.out.println(beanDefinitionCount);
        System.out.println(beanDefinitionCount);
        System.out.println(beanDefinitionCount);
        System.out.println(beanDefinitionCount);
    }

}
