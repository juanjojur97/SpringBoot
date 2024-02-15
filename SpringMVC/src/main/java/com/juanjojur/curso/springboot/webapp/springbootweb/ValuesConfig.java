package com.juanjojur.curso.springboot.webapp.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource(value="classpath:values.properties",encoding = "UTF-8")
public class ValuesConfig {

}
