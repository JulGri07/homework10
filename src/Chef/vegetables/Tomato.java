package Chef.vegetables;

public class Tomato extends Solanaceae{

    static private double calories = 24;

    public Tomato() {
        super("Tomato", calories);
    }

    public Tomato(double weight) {
        super("Tomato", calories, weight);
    }

}
