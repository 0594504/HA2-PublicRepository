package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BurgerTest {

    @Test
    void precomputedBurgerTest() {
        Burger burger = new PrecomputedBurger(5.0, 500, List.of("Brötchen", "Rindfleisch", "Salat"));
        assertEquals(5.0, burger.calculatePrice());
        assertEquals(500, burger.calculateCalories());
        assertEquals(List.of("Brötchen", "Rindfleisch", "Salat"), burger.getIngredientNames());
    }

    @Test
    void dynamicallyComputedBurgerTest() {
        List<Ingredient> ingredients = List.of(
                new Ingredient("Brötchen", 1.0, 150),
                new Ingredient("Rindfleisch", 3.0, 250),
                new Ingredient("Salat", 0.5, 10)
        );
        Burger burger = new DynamicallyComputedBurger(ingredients);
        assertEquals(4.5, burger.calculatePrice());
        assertEquals(410, burger.calculateCalories());
        assertEquals(List.of("Brötchen", "Rindfleisch", "Salat"), burger.getIngredientNames());
    }
}
