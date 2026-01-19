package methodes;

import java.beans.XMLEncoder;
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



    }
}
