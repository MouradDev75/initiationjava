package principal;


import encapsulation.Rectangle;

public class App {

    public static void main(String[] args) {

        /*
        approche classique: repose sur l'utilisation de params et de fonctions
        approche objets: repose sur l'utilisation de classes et d'objets

        Une classe est un type de données, elle a pour tâche principale de décrire la structure. Elle définie une sorte de template
        à partir duquel on crée des instances. Elle contient généralement 3 choses:
        - les attributs de l'objets
        - des méthodes
        - une méthode (spéciale) publique qui porte le nom de la classe appelée construteur pemettant d'instancier la classe en question.
        Le rôle du constructeur est d'initialiser l'ensemble des attributs de l'objet à construire

         */

        System.out.println(User.profil);

        User u = new User(); //par défaut:  nom = null  age = 0
        u.nom = "DUPONT";
        u.age = 50;

        User u2 = new User("FEDERER", 40);

        u2.afficherDetails();
        u.afficherDetails();

        /*
        Concepts objets: Encapsulation - Héritage - Abstraction - Polymorphisme - Composition (association)
         */

        System.out.println("******************Encapsulation*************************");

        double hauteur = 10, largeur = 15;
        double surf = surface(hauteur, largeur);
        /*
        pour passer du procédurale à l'objet:
        1- regrouper dans une seule et mm classe tous les params et les fcts qui concernent le mm sujet
        2- pas d'accès publique aux attributs d'une classe, l'accès passe forcément par les accésseurs (getter/setter)
         */

        Rectangle rec = new Rectangle();
        rec.setHauteur(-10);
        rec.setLargeur(15);
        rec.surface();

        Rectangle rec1 = new Rectangle(-30, 22);






    }

    private static double surface(double hauteur, double largeur) {
        return hauteur * largeur;
    }

}

