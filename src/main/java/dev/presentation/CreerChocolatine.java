package dev.presentation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;

@Controller
public class CreerChocolatine extends Option implements OptionIhm {
	@Autowired
    private ChocolatineService chocolatineService;
    public CreerChocolatine() {
        super("Creér chocolatine");
    }

    @Override
    public void executer() {
        System.out.println("Saisir un nom :");
        String nom = scan.next();
        System.out.println("Saisir un poids :");
        float poids  = scan.nextFloat();
        System.out.println("Saisir une température");
        float temp = scan.nextFloat();
        System.out.println("Saisir un prix");
        float prix = scan.nextFloat();
        Chocolatine chocolatine = new Chocolatine(nom,poids,temp,prix);
        chocolatineService.ajouterChocolatine(chocolatine);
    }
}
