package dev.presentation;

import java.util.Scanner;

public abstract class Option {
    private String libelle;
    protected Scanner scan = new Scanner(System.in);

    public Option(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
