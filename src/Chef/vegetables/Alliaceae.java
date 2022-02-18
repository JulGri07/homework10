package Chef.vegetables;

public class Alliaceae extends Vegetable {

    public Alliaceae(String name, double calories) {
        super(name, calories);
        setCategory("Alliaceae vegetables");
    }

    public Alliaceae(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Alliaceae vegetables");
    }
}
