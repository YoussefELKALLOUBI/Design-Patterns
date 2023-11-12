package com.company.factory.Pizzeria;

public class PizzeriaBrest extends Pizzeria {
    Pizza creerPizza(String item) {
        Pizza pizza = null;
        if (item.equals("fromage")) {
            // pizza = new PizzaFromageStyleBrest();
        } else if (item.equals("vegetarienne")) {
            // pizza = new PizzaVegetarienneStyleBrest();
        } else if (item.equals("fruitsDeMer")) {
            // pizza = new PizzaFruitsDeMerStyleBrest();
        } else if (item.equals("poivrons")) {
            // pizza = new PizzaPoivronsStyleBrest();
        }
        return pizza;
    }
}
