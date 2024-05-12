package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.DummyBurgerImpl;
import htw.berlin.wi.prog2.domain.Ingredient;
import htw.berlin.wi.prog2.domain.Burger;

public class BurgerBuilder {

    public BurgerBuilder add(Ingredient ingredient) {
        // TODO hier die Annahme von Zutaten implementieren
        return this; // die Rückgabe von this sollte beibehalten bleiben (siehe Benutzung im BurgerBuilderTest)
    }

    public Burger buildPrecomputed() {
        // TODO hier stattdessen die neue Klasse PrecomputedBurger verwenden
        return new DummyBurgerImpl();
    }

    public Burger buildDynamicallyComputed() {
        // TODO hier stattdessen die neue Klasse DynamicallyComputedBurger verwenden
        return new DummyBurgerImpl();
    }
}
