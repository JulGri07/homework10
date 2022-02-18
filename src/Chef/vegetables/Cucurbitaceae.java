package Chef.vegetables;

public class Cucurbitaceae extends Vegetable{

    public Cucurbitaceae(String name, double calories) {
        super("Cucumber", 14);
        setCategory("Cucurbitaceae vegetables");
    }

    public Cucurbitaceae(String name, double calories, double weight) {
        super("Cucumber", 14, weight);
        setCategory("Cucurbitaceae vegetables");
    }
}
