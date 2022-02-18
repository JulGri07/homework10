package Chef.сompare;

import Chef.vegetables.Vegetable;

public class CaloriesComparator  implements java.util.Comparator<Vegetable>{

    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v1.getCalories() - v2.getCalories());
    }
}