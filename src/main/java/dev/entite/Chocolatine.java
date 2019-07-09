package dev.entite;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chocolatine")
public class Chocolatine extends BaseEntite {
 
    private String nom;
    private float poids;
    private float temperature;
    private float prix;


    //Constructor
    public Chocolatine() {
    }

    public Chocolatine(int id, String nom, float poids, float temperature, float prix) {
        this.id = id;
        this.nom = nom;
        this.poids = poids;
        this.temperature = temperature;
        this.prix = prix;
    }

    public Chocolatine(String nom, float poids, float temperature, float prix) {
        this.nom = nom;
        this.poids = poids;
        this.temperature = temperature;
        this.prix = prix;
    }

    //Getter && Setter


   


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", poids=" + poids +
                ", temperature=" + temperature +
                ", prix=" + prix;
    }
}
