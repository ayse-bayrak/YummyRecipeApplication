package com.cydeo;

import com.cydeo.config.DbConfigData;
import com.cydeo.model.Ingredient;
import com.cydeo.model.QuantityType;
import com.cydeo.model.Recipe;
import com.cydeo.model.RecipeType;
import com.cydeo.repository.RecipeRepositoryImp;
import com.cydeo.service.FacebookShareServiceImpl;
import com.cydeo.service.InstagramShareServiceImpl;
import com.cydeo.service.RecipeService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class YummyRecipeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(YummyRecipeApplication.class, args);


        RecipeService recipeService = context.getBean(RecipeService.class);
        //create instance container

        recipeService.saveRecipe(); // requirement 1 -- save recipe
        recipeService.shareRecipe(); // requirement 2 -- share recipe
        recipeService.printConfigData(); //requirement 3 -- print details maybe author using application.properties with @Value
        recipeService.printDbConfigData();// requirement 4 --print details maybe author using application.properties with @ConfigurationProperties(prefix= "db")

    }



}
