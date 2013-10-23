package com.simplicityitself.springdistilled.koan1;

import spock.lang.Specification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

class Koan1 extends Specification {
    def "Create an ApplicationContext of type org.springframework.context.support.GenericApplicationContext"() {

        when:
        ApplicationContext applicationContext = null;

        then:
        applicationContext != null;
        applicationContext.getClass() == GenericApplicationContext.class;
    }
}  
