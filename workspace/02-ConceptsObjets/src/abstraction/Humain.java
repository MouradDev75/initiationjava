package abstraction;

/**
 * Classes filles: Homme, Femme
 */
public abstract class Humain {

    private String nom;
    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Humain(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Humain() {
    }

    //méthode abstraite: méthode non implémentée que toutes les filles doivent implémenter
    public abstract void identite();
}
