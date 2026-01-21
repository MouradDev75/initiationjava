package tp;

public abstract class Employe {

    private String nom;
    private String prenom;
    private int age;
    private String dateEntree;

    public abstract double calculerSalaire();

    public String getNom(){
        return getTitre()+prenom+" "+nom;
    }

    public String getTitre(){
        return "L'employé ";
    }

    public Employe(String nom, String prenom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }
}
