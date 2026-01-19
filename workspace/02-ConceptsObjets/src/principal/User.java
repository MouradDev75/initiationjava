package principal;


//classe objet
public class User {

    //attributs d'instances

    public String nom;
    public int age;

    //attribut de classe (global): indépendant des instances
    public static String profil = "admin";

    public User(String nom, int age) {
        //this: mot clé qui pointe vers l'objet en cours d'utilisation
        this.nom = nom;
        this.age = age;
    }

    //constructeur nécessaire pour des bibliothèque externe
    public User() {
    }

    //méthodes
    //méthode d'instance concerne une instance particuière

    public void afficherDetails(){
        System.out.println("Nom: "+this.nom+" Age: "+this.age);
    }

    private void test(){

    }

    public static void changerProfil(String nomProfil){
        profil = nomProfil;
    }



}
