package com.cydeo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix= "db")
@Data
public class DbConfigData {

    private String author; // db.username
    private String gender;
    private String age;



}
