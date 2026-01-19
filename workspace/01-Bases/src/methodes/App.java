package methodes;

import java.beans.XMLEncoder;
import java.util.Optional;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*
        Méthode: est un ensemble d'instructions réutilisable
        2 types de méthodes:
        Procédure: méthode qui ne renvoie aucun résultat (méthode void)
        Fonction: méthode qui renvoie un résultat
        Syntaxe: visibilité [static] void_ou_type_de_retour nomMethode(params) {instructions;}
         */

      MesMethodes m = new MesMethodes(); // m est une instance de la classe MesMethodes
        m.afficher();

      int r = MesMethodes.somme(10,15);
        System.out.println(r);

      int[] tableau = {1,6,3,5,4,2};

      MesMethodes.afficher(tableau);

        System.out.println("somme: "+MesMethodes.sommeTableau(tableau));
        System.out.println("moyenne: "+MesMethodes.moyenneTableau(tableau));
        System.out.println("min: "+MesMethodes.minTableau(tableau));

        int val1 = 10;

        MesMethodes.changeInt(val1);
        System.out.println("val1 = "+val1);

        MesMethodes.changeArray(tableau);
        System.out.println("premier élément de tableau: "+tableau[0]);

        //Type Optionnal: méthode avec des params optionnels

        //option1:
        MesMethodes.printName("DUPONT", Optional.of("Jean"));
        MesMethodes.printName("DUPONT", Optional.empty());

        //option2:
        MesMethodes.imprimerNom("DUPONT", "Jean");
        MesMethodes.imprimerNom("DUPONT", null);

        //appelle de la méthode avec un nbre variable de params

        System.out.println("somme variable: "+MesMethodes.sum(10,20));
        System.out.println("somme variable: "+MesMethodes.sum(10,20,30));
        System.out.println("somme variable: "+MesMethodes.sum(10,20,30,40));
        System.out.println("somme variable: "+MesMethodes.sum(10,20,30,40,50));



    }//fin du main
}
