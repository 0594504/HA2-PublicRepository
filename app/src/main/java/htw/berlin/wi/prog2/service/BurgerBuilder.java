package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.DummyBurgerImpl;
import htw.berlin.wi.prog2.domain.Ingredient;
import htw.berlin.wi.prog2.domain.Burger;
import htw.berlin.wi.prog2.domain.DynamicallyComputedBurger;
import htw.berlin.wi.prog2.domain.PrecomputedBurger;
import htw.berlin.wi.prog2.service.IllegalBurgerException;

import java.util.ArrayList;
import java.util.List;

public class BurgerBuilder {
    private List<Ingredient> ingredients;

    public BurgerBuilder() {
        this.ingredients = new ArrayList<>();
    }

    public BurgerBuilder add(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    private void resetIngredients() {
        this.ingredients = new ArrayList<>();
    }

    public Burger buildPrecomputed() {
        if (ingredients.size() < 2) {
            throw new IllegalBurgerException("Ein Burger muss mindestens zwei Zutaten enthalten.");
        }
        double price = ingredients.stream().mapToDouble(Ingredient::getPrice).sum();
        int calories = ingredients.stream().mapToInt(Ingredient::getCalories).sum();
        List<String> ingredientNames = ingredients.stream().map(Ingredient::getName).toList();
        PrecomputedBurger burger = new PrecomputedBurger(price, calories, ingredientNames);
        resetIngredients();
        return burger;
    }

    public Burger buildDynamicallyComputed() {
        if (ingredients.size() < 2) {
            throw new IllegalBurgerException("Ein Burger muss mindestens zwei Zutaten enthalten.");
        }
        DynamicallyComputedBurger burger = new DynamicallyComputedBurger(new ArrayList<>(ingredients));
        resetIngredients();
        return burger;
    }
}
