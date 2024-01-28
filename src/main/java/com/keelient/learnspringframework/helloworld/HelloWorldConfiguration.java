package com.keelient.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Oliver Queen";
    }

    @Bean
    public int age() {
        return 50;
    }

    @Bean
    public Person person() {
        var person = new Person("John", 45, new Address("69, Main Street", "London"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        var person = new Person(name(), age(), new Address("68, Little Street", "Manchester"));
        return person;
    }

    /*
        log.info("{}", context.getBean("person3Parameters"));
        Despite the method person3Parameters requiring three parameters, no arguments are passed in this line.
        This works because the Spring framework is capable of resolving the dependencies of a bean at runtime.
        In this case, it can infer the values for the name, age, and address2 parameters based on the available
        beans in the context.
     */

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        var person = new Person(name, age, address2);
        return person;
    }

    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("addressQualifier") Address address) {
        var person = new Person(name, age, address);
        return person;
    }

    @Bean(name = "address")
    @Primary
    public Address address() {
        var address = new Address("666, 5th Avenue", "New York");
        return address;
    }

    @Bean(name = "address2")
    @Qualifier("addressQualifier")
    public Address address2() {
        var address = new Address("69, 2th Avenue", "New York Qualifier");
        return address;
    }

    @Bean(name = "address3")
    public Address address3() {
        var address = new Address("888, 888 th Avenue", "New York");
        return address;
    }
}