package Chef.vegetables;

public class Solanaceae extends Vegetable {

    public Solanaceae(String tomato, double calories) {
        super("Tomato", 24);
        setCategory("Solanaceae vegetables");
    }

    public Solanaceae(String name, double calories, double weight) {
        super("Tomato", 24, weight);
        setCategory("Solanaceae vegetables");
    }

}
