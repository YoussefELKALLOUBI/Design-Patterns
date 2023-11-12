package com.company.factory.Pizzeria;

public abstract class Pizzeria {
    
    public Pizza commanderPizza(String type) {
        Pizza pizza = creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();
        return pizza;
    }

    abstract Pizza creerPizza(String item);
}
