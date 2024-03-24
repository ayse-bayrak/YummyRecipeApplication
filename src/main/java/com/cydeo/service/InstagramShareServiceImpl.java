package com.cydeo.service;

import com.cydeo.model.Recipe;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class InstagramShareServiceImpl implements ShareService{
    @Override
    public void shareRecipe(Recipe recipe) {
        System.out.println("Recipe object's detail is printing on Instagram:" );
        System.out.println(recipe);
    }
}
