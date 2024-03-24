package com.cydeo.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    private String id;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredient> ingredient;
    private RecipeType recipeType;

}
