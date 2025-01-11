package com.spring.project;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Service;

/*
 * THIS IS HOW TO CREATE OUR OWN CUSTOM ANNOTATIONS IN JAVA
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Service
public @interface MyCustomAnnotation {

}
