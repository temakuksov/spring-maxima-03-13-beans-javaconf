package ru.maxima.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.maxima.spring")
@PropertySource("classpath:application.properties")
public class SpringConfig {



}
