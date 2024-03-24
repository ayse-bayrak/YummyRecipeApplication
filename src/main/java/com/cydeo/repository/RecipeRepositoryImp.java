package com.cydeo.repository;

import com.cydeo.model.Recipe;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RecipeRepositoryImp implements RecipeRepository{
    @Override
    public void saveRecipe(Recipe recipe) {
        // something add to List Recipe
        System.out.println(recipe + " is added to List of Recipe");
        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(recipe);
    }
}
