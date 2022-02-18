package Chef.vegetables;

public class Vegetable {
    private String name;
    private double calories;
    private double weight;
    private String category;


    public Vegetable(String name) {

        this.name = name;
    }

    public Vegetable(String name, double calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("Cannot create vegetable with "
                    + calories + "kcal");
        }

        this.name = name;
        this.calories = calories;
        this.weight = 100;
    }

    public Vegetable(String name, double calories, double weight) {
        if (calories < 0) {
            throw new IllegalArgumentException("Cannot create vegetable with "
                    + calories + "kcal");
        }

        if (weight < Double.MIN_NORMAL) {
            throw new IllegalArgumentException("Cannot create " + weight
                    + "g of " + name);
        }

        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String toString() {
        return (weight + " gramms of " + name + " (" + category + "), "
                + getTotalCalories() + "kcal (" + getCalories() + "kcal/100g)");
    }

    public double getTotalCalories() {
        return calories * weight / 100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
