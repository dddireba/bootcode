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
        System.out.println("slave");
        System.out.println(beanDefinitionCount);
        System.out.println("push test");
        System.out.println("push test2");
        System.out.println("pull test");
    }

}
