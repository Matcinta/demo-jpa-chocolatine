//package dev.presentation;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import dev.entite.Chocolatine;
//import dev.service.ChocolatineService;
//
//@Controller
//public class CreerLivreur extends Option implements OptionIhm {
//    @Autowired
//    private LivreurService livreurService;
//
//    public CreerLivreur() {
//        super("Creér un livreur");
//    }
//
//    @Override
//    public void executer() {
//        List<Chocolatine> chocolatineMap = chocolatineService.listerChocolatine();
//        chocolatineMap.forEach((c) -> {
//            System.out.println(c.getId() + ": " + c);
//        });
//
//    }
//    
//    
//    public void creerLivreur() {
//        
//        scanner.nextLine();
//        System.out.println("Vous souhaitez ajouter un nouveau livreur ");
//        System.out.println("Saisir le nom du livreur: ");
//        String nom = scanner.nextLine();
//        
//        System.out.println("Saisir le prénom: ");
//        String prenom = scanner.nextLine();
//
//        Livreur l = Constantes.LIVREUR_SERVICE.addLivreur(nom, prenom);
//        
//        System.out.println(l);
//
//    }
//}
