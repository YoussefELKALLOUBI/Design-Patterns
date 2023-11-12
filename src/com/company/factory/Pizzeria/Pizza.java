package com.company.factory.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String nom;
    String pate;
    String sauce;
    List garnitures = new ArrayList();

    abstract void preparer();

    void cuire() {
        System.out.println("Cuisson 15 minutes à 180°");
    }

    void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    void emballer() {
        System.out.println("Emballage dans une boite officielle");
    }

    void setNom(String nom) {
        this.nom = nom;
    }

    String getNom() {
        return nom;
    }
}