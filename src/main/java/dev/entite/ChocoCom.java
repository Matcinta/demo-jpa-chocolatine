package dev.entite;

import javax.persistence.*;

@Entity
@Table(name = "choco_commande")
public class ChocoCom extends BaseEntite {

    @ManyToOne
    @JoinColumn(name = "id_chocolatine")
    private Chocolatine chocolatine;
    
    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Commande commande;
    
    private int quantite;

    public ChocoCom() {
    }

    public ChocoCom(int id, Chocolatine chocolatine, Commande commande, int quantite) {
        this.id = id;
        this.chocolatine = chocolatine;
        this.commande = commande;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

  

    public Chocolatine getChocolatine() {
        return chocolatine;
    }

    public void setChocolatine(Chocolatine chocolatine) {
        this.chocolatine = chocolatine;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
