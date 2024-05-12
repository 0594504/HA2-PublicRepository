package htw.berlin.wi.prog2.domain;

import java.util.List;

public class PrecomputedBurger implements Burger {
    private final double price;
    private final int calories;
    private final List<String> IngredientNames;

    public PrecomputedBurger(double price, int calories, List<String> IngredientNames) {
        this.price = price;
        this.calories = calories;
        this.IngredientNames = IngredientNames;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public int calculateCalories() {
        return calories;
    }

    @Override
    public List<String> getIngredientNames() {
        return IngredientNames;
    }
}
