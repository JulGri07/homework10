package Chef;

import Chef.recipes.RecipeVitamin;
import Chef.recipes.Salad;
import Chef.vegetables.Vegetable;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chef {
    private String name;
    private Salad salad;

    public Chef() {
        name = "Jul";
        salad = new Salad();
    }

    public Chef(String name) {
        this.name = name;
        salad = new Salad();
    }

    public Chef(String name, Salad salad) {
        this.name = name;
        this.salad = salad;
    }

    public Vegetable getIngredient(Scanner scanner) {
        String ingredientName;
        double weight;

        System.out.println("Enter the ingredient name:");
        ingredientName = scanner.next();

        System.out.println("Enter the weight (in gramms):");

        try {
            weight = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong weight!");
            scanner.next();

            return null;
        }

        // create new vegetable using reflection
        try {
            Class [] parameters = {double.class};
            ingredientName = "Chef.vegetables." + ingredientName;
            Class ingredientClass = Class.forName(ingredientName);
            Constructor constructor =
                    ingredientClass.getDeclaredConstructor(parameters);
            Vegetable vegetable = (Vegetable) constructor.newInstance(
                    new Object[]{weight});

            return vegetable;
        }
        catch (Exception e) {
            System.out.println("No such ingredient!");

            return null;
        }
    }


    public void showIngredientsForCalories(Scanner scanner) {
        double lowerCalories, upperCalories;

        System.out.println("Enter the lower limit:");
        try {
            lowerCalories = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        System.out.println("Enter the upper limit:");
        try {
            upperCalories = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        salad.showIngredientsByCalories(lowerCalories, upperCalories);
    }


    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Vegetable vegetable = null;

        System.out.println("Hello! My name is " + name + ".");
        System.out.println("What do you want to cook today?");
        System.out.println("FOR DEBUGGING ENTER 7 TO SET DEFAULT RECIPE OF SALAD");

        while (choice != 0) {
            System.out.println("\nChoose one of the options:");
            System.out.println("1. Set name of salad");
            System.out.println("2. Show recipe");
            System.out.println("3. Add ingredient");
            System.out.println("4. Sort ingredients by calories");
            System.out.println("5. Sort ingredients by weight");
            System.out.println("6. Get ingredients for calories");
            System.out.println("7. Set VitaminSalad recipe");
            System.out.println("0. Exit");

            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }

            switch(choice) {
                case 1:
                    System.out.println("Name your salad:");
                    salad.setname(scanner.next());
                    System.out.println("Successful");
                    break;

                case 2:
                    salad.showRecipe();
                    break;

                case 3:
                    vegetable = getIngredient(scanner);
                    if (vegetable != null) {
                        if (!salad.addIngredient(vegetable)) {
                            System.out.println("Cannot add ingredient!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Receipt sorted by Calories");
                    salad.sortIngredientsByCalories();
                    salad.showRecipe();
                    break;

                case 5:
                    System.out.println("Receipt sorted by weight");
                    salad.sortIngredientsByWeight();
                    salad.showRecipe();
                    break;

                case 6:
                    showIngredientsForCalories(scanner);
                    break;

                case 7:
                    salad = new RecipeVitamin();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }
}
