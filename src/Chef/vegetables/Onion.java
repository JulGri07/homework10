package Chef.vegetables;

public class Onion extends Alliaceae{

    static private double calories = 40;

    public Onion() {

        super("Onion", calories);
    }

    public Onion(double weight) {

        super("Onion", calories, weight);
    }

}
