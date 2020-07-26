package bcc.springframework.controllers;

import bcc.springframework.domain.Ingredient;
import bcc.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Iterator;
import java.util.Set;

@Controller
public class IndexController {
   // private CategoryRepository categoryRepository;
   // private UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /*
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }
    */

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        /*
        Optional<Category> categoryOption = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOption = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat id is : " + categoryOption.get().getId());
        System.out.println("Uom id is : " + unitOfMeasureOption.get().getId());

         */
        System.out.println("Recipes:" + recipeService.getRecipes());


        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }


}
