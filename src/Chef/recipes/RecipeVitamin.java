package Chef.recipes;

import Chef.vegetables.Cucumber;
import Chef.vegetables.Onion;
import Chef.vegetables.Pepper;
import Chef.vegetables.Tomato;

public class RecipeVitamin extends Salad {
    public RecipeVitamin() {
        setname("Vitamin");

        addIngredient(new Tomato(400));
        addIngredient(new Onion(400));
        addIngredient(new Pepper(120));
        addIngredient(new Cucumber(345));
    }

}
