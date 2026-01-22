package principal;

import java.io.Serializable;

public class Produit implements Serializable {

    //possibilité d'ajouter une clé de cryptage pour le format binaire
    private static final long serialVersionUID = 22012026;

    private int id;
    private String description;
    private double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produit(int id, String description, double prix) {
        this.id = id;
        this.description = description;
        this.prix = prix;
    }

    public Produit() {
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
