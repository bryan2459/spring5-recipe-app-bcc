package bcc.springframework.services;

import bcc.springframework.domain.Ingredient;
import bcc.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

}
