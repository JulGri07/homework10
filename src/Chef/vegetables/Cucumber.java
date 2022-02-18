package Chef.vegetables;

public class Cucumber extends Cucurbitaceae{

    static private double calories = 14;

    public Cucumber() {
        super("Cucumber", calories);
    }

    public Cucumber(double weight) {
        super("Cucumber", calories, weight);
    }

}
