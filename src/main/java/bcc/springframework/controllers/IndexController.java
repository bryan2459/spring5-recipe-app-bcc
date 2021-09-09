package bcc.springframework.controllers;

import bcc.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        /*
        Optional<Category> categoryOption = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOption = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat id is : " + categoryOption.get().getId());
        System.out.println("Uom id is : " + unitOfMeasureOption.get().getId());
        recipe.recipeNotes
         */

        model.addAttribute("recipes", recipeService.getRecipes());

        /*
        Set<Ingredient> mex = guacRecipe.getIngredients();
        Ingredient mex1;
        Iterator<Ingredient> itr;
        itr = mex.iterator();
        System.out.println("Traversing over Set using Iterator"); while(itr.hasNext()){ //System.out.println(itr.next());
            mex1 = itr.next();
            System.out.println(mex1.getDescription()+ " " + mex1.getAmount());
        }
        */

        return "index";
    }


}
