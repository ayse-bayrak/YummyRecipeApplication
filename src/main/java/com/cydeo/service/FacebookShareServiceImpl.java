package com.cydeo.service;

import com.cydeo.model.Recipe;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FacebookShareServiceImpl implements ShareService{
    @Override
    public void shareRecipe(Recipe recipe) {
        System.out.println("Recipe object's detail is printing on Facebook:" );
        System.out.println(recipe);
    }
}
