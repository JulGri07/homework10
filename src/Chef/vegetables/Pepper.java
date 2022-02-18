package Chef.vegetables;

public class Pepper extends Piperaceae{

    static private double calories = 40;

    public Pepper() {

        super("Pepper", calories);
    }

    public Pepper(double weight) {

        super("Pepper", calories, weight);
    }
}
