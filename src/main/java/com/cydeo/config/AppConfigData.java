package com.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppConfigData {

    @Value("Ayse")
    private String author;
    @Value("Male")
    private String gender;
    @Value("42")
    private String age;
}
