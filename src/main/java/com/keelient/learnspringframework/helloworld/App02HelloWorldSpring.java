package com.keelient.learnspringframework.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1: Launch a Spring context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            //2: Configure the things we want Spring framework to manage
            //HelloWorldConfiguration - @Configuration
            //name - @Bean

            //3: Retrieving Beans managed by Spring
            log.info((String) context.getBean("name"));
            log.info("{}", context.getBean("age"));
            log.info("{}", context.getBean("person"));
            log.info("{}", context.getBean("person2MethodCall"));
            log.info("{}", context.getBean("person3Parameters"));
            log.info("--> Address");
            log.info("{}", context.getBean(Address.class));
            log.info("--> Address2");
            log.info("{}", context.getBean("address2"));
            log.info("--> Address3");
            log.info("{}", context.getBean("address3"));
            log.info("--> person4Parameters");
            log.info("{}", context.getBean("person4Parameters"));


            String[] beans = context.getBeanDefinitionNames();
            Arrays.stream(beans)
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
