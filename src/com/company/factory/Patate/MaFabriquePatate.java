package com.company.factory.Patate;

public class MaFabriquePatate implements
        FabriqueElementPatate {
    public Chapeau creerChapeau() {
        return new ChapeauNoir();
    }

    public Nez creerNez() {
        return new GrosNezOrange();
    }

    public Oreille[] creerOreille() {
        Oreille oreilles[] = { new GrandeOreille(),
                new GrandeOreille() };
        return oreilles;
    }

public Bras[] creerBras() {
}
}
