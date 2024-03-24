package com.cydeo.service;

import com.cydeo.config.AppConfigData;
import com.cydeo.config.DbConfigData;
import com.cydeo.model.Ingredient;
import com.cydeo.model.QuantityType;
import com.cydeo.model.Recipe;
import com.cydeo.model.RecipeType;
import com.cydeo.repository.RecipeRepositoryImp;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RecipeService {

  //  private final Faker faker;
    private final RecipeRepositoryImp recipeRepositoryImp;
    private final ShareService shareService;
    private final AppConfigData appConfigData;
    private final DbConfigData dbConfigData;

    public RecipeService(RecipeRepositoryImp recipeRepositoryImp, ShareService shareService, AppConfigData appConfigData, DbConfigData dbConfigData) {
        this.recipeRepositoryImp = recipeRepositoryImp;
        this.shareService = shareService;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }
    public Recipe prepareRecipe() {
    // create a Recipe object by the help of Faker library.
     Faker faker = new Faker(); //it does not necessary ?
        // Ingredient is created

        List<Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Ingredient(faker.food().ingredient(), 2, QuantityType.LB));

        //Recipe is created
        String name = faker.food().dish();
        String preparation = faker.lorem().paragraph(5);

        Recipe recipe1 = new Recipe();
        recipe1.setId("001");
        recipe1.setName(name);
        recipe1.setDuration(10);
        recipe1.setPreparation(preparation);
        recipe1.setIngredient(ingredients1);
        recipe1.setRecipeType(RecipeType.BREAKFAST);
        return recipe1;
    }

    public void saveRecipe() {
       recipeRepositoryImp.saveRecipe(prepareRecipe());
    }

    public void shareRecipe() {
      shareService.shareRecipe(prepareRecipe());

    }

    public void printConfigData(){
        System.out.println(appConfigData.getAuthor());
        System.out.println(appConfigData.getGender());
        System.out.println(appConfigData.getAge());
    }
    public void printDbConfigData(){
        System.out.println(dbConfigData.getAuthor());
        System.out.println(dbConfigData.getGender());
        System.out.println(dbConfigData.getAge());
    }
}
