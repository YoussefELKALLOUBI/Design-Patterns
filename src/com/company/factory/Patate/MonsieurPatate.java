package com.company.factory.Patate;

Public class MonsieurPatate {
    
    FabriqueElementPatate fabLab;
    Chapeau chapeau;
    Nez nez;
    Yeux yeux;
    Moustache moustache;
    Bouche bouche;
    Pieds pieds;
    Oreille[] oreilles;
    Bras[] bras;

    public MonsieurPatate(FabriqueElementPatate fab) {
        fablab = fab;
    }

    void preparer() {
        chapeau = fabLab.creerChapeau();
        nez = fabLab.creerNez();
    }

    void assembler() {
        System.out.println("assembler les éléments");
    }

    void jouer() {
        System.out.println("Vers l’infini et au-delà !");
    }
}
