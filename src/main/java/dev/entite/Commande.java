package dev.entite;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "commandes_details")
public class Commande extends BaseEntite {

    @Column(name = "date_livraison")
    private LocalDateTime dateLivraison;
    
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('EN_ATTENTE', 'EN_COURS_DE_LIVRAISON', 'LIVRÉ')")
    private Statut statut;
    
    @OneToMany(mappedBy = "commande")
    private List<ChocoCom> chocoComs;
    
    @ManyToOne
    @JoinColumn(name = "id_livreur")
    private Livreur livreur;


    public Commande() {
    }

    public Commande(int id, List<ChocoCom> chocoComs, LocalDateTime dateLivraison) {
        this.id = id;
        this.chocoComs = chocoComs;
        this.dateLivraison = dateLivraison;
    }

  
    public List<ChocoCom> getChocoComs() {
        return chocoComs;
    }

    public void setChocoComs(List<ChocoCom> chocoComs) {
        this.chocoComs = chocoComs;
    }

    public LocalDateTime getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDateTime dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
}
