package bcc.springframework.services;

import bcc.springframework.commands.RecipeCommand;
import bcc.springframework.domain.Ingredient;
import bcc.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
