package composition;

public class Client {

    /*
    composition (association): c'est le fait qu'un objet Adresse puisse faire partie des attributs d'un objet Client
     */
    private String nom;
    private Adresse adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Client(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public Client() {
    }
}
