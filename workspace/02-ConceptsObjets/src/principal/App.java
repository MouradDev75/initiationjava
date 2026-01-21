package principal;


import abstraction.Femme;
import abstraction.Homme;
import abstraction.Humain;
import composition.*;
import encapsulation.CompteBancaire;
import encapsulation.Rectangle;
import heritage_polymorphisme.*;

public class App {

    public static void main(String[] args) throws Exception {

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
        Concepts objets: Encapsulation - Héritage -  Polymorphisme - Abstraction -Composition (association)
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

        CompteBancaire cpt1 = new CompteBancaire("sdqs155", 1000);
        cpt1.depot(500);
        cpt1.retrait(350);

        System.out.println(cpt1);

        CompteBancaire cpt2 = new CompteBancaire("ddddd11",250);
        CompteBancaire cpt3 = new CompteBancaire("ddddd11",2250);

        System.out.println(cpt2.equals(cpt3));


        cpt1 = null;
        cpt2 = null;
        cpt3 = null;

        System.gc(); //appelle explicite du garbage collector -> qui ne garantit pas son passage immédiat
        //Runtime.getRuntime().gc();

        System.out.println("***************** Héritage *******************");

        Animal a = new Animal();
        a.setNom("animal");
        a.setAge(5);
        a.emettreSon();

        Chat c = new Chat();
        c.setNom("chat");
        c.setAge(3);
        c.emettreSon();

        Animal a2 = new Animal("a2", 8);
        Chat c2 = new Chat("c2", 2, "gris");

        /*
        une classe mère définie une structure de base pour les classes filles, contient les éléments communs (attributs et méthodes)
        une classe fille, via l'héritage récupère tous les membres de la classe mère
        une classe fille, en plus des attributs définis dans la classe mère, elle peut avoir des attributs qui lui sont spécifiques
        une classe fille, en plus des méthodes définies dans la classe mère, elle peut avoir des méthodes qui lui sont spécifiques
        une classe fille, en cas de besoin eut redéfinir les méthodes de la classe mère
         */

        Animal animal1 = new Animal();
        Animal animal2 = new Chat();
        Animal animal3 = new Chien();

        /*
        polymorphisme: c'est le fait qu'un objet puisse prendre plusieurs formes.
        c'est une conséquence de l'héritage, c'est le fait que l'objet parent puisse prendre la forme de tous les objets enfants
         */

        Object o = 10;
        Object o1= "test";
        Object o2 = new Animal();


        //collection polymorphique:
        Animal[] animaux = new Animal[10];
        animaux[0] = new Animal();
        animaux[1] = new Chat();
        animaux[2] = new Chien();
        animaux[3] = new Giraffe();


        son(new Animal());
        son(new Chat());
        son(new Chien());
        son(new Giraffe());

        A[] tabA = new A[3];
        B[] tabB = new B[3];
        C[] tabC = new C[3];

        ClasseSup[] myTab = new ClasseSup[10];

        System.out.println("************************** Abstraction *********************");
        /*
        une classe abstraite est une classe non instanciable.
         */
        Homme h = new Homme();
        Femme f = new Femme();
        Humain hum = new Homme();

        System.out.println("************************** Composition *********************");

        Client cl1 = new Client("Carrefour", new Adresse(10, "rue machin 75015 Paris"));

        IClient persistence = new ClientFichierImp();
        persistence.insert(cl1);
        persistence.update(cl1);
        persistence.delete(cl1);


    }

    private static double surface(double hauteur, double largeur) {
        return hauteur * largeur;
    }
    //méthode polymorphique: polymorphisme par sous typage
    public static void son(Animal a){
        a.emettreSon();
    }

    //poymorphisme ad-hoc: nécessite un contrôle + cast
    public static void son2(Object o){
        if(o instanceof Animal){
            Animal a = (Animal) o;
            a.emettreSon();
        }
    }


    public static void methdeA(A a){

    }

    public static void methdeB(B b){

    }

    public static void methdeC(C c){

    }

    public static void myMethod(ClasseSup c){

    }

}

