package Chef.vegetables;

public class Piperaceae extends Vegetable {

    public Piperaceae(String name, double calories) {
        super(name, calories);
        setCategory("Piperaceae vegetables");
    }
    public Piperaceae (String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Piperaceae vegetables");
    }
}
