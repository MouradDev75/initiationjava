package methodes;

import java.util.Optional;

//classe service
public class MesMethodes {
    /*
    pour définir une méthode, une classe est nécessaire
    Syntaxe: visibilité [static] void_ou_type_de_retour nomMethode(params) {instructions;}

    une classe peut contenir 2 types de méthodes:
    - méthode d'instance: est accéssible via une instance de la classe
    - méthode de classe (static): accéssible via la classe. NomClasse.nomMethode()

     */



    /**
     *
     */
    public void afficher() {
        System.out.println("méthode afficher.........");
    }

    //méthode de classe:

    /**
     * Méthode qui renvoie la somme de 2 entiers
     *
     * @param x est un entier
     * @param y est entier
     * @return somme de x et y
     * @author Mourad
     */
    public static int somme(int x, int y) {
        return x + y;
    }

    /*
    surcharger une méthode (overload): c'est pouvoir définir la même méthode dans la même en modifiant ses params soit en type, soit en nombre
     */

    public static int somme(int x, int y, int z) {
        return x + y + z;
    }

    public static double somme(double x, double y) {
        return x + y;
    }

    public static void afficher(int[] tab) {
        for (int e : tab) {
            System.out.println(e);
        }
    }

    //méthode qui renvoie la somme des éléments d'un tableau d'entiers

    public static int sommeTableau(int[] tab) {
        int s = 0;
        for (int i : tab) {
            s += i;
        }

        return s;
    }

    //méthode qui renvoie la moyenne des éléments d'un tableau d'entiers

    public static double moyenneTableau(int[] tab) {
        return (double) sommeTableau(tab) / tab.length;
    }

    //méthode qui renvoie l'élément le plus petit d'un tableau d'entiers

    public static int minTableau(int[] tab) {
        int m = Integer.MAX_VALUE;
        for (int e : tab) {
            if (e < m) {
                m = e;
            }
        }
        return m;
    }

    //passage de params par valeur
    public static void changeInt(int x) {
        x += 10;
    }

    //passage de params par réference
    public static void changeArray(int[] tab) {
        tab[0] += 10;
    }

    public static int changeInteger(int x) {
        return x += 10;
    }

    /*
    méthode avec des params optionnels
    le type Optional ne fonctionne qu'avec des types complexes (uniquement les types nullables)
    pour les types simples, utilisez leur wrapper: Optional<Integer>
     */

    //option1:

    public static void printName(String nom, Optional<String> optionalPrenom) {


        if (optionalPrenom.isEmpty()) {
            System.out.println("Nom: " + nom);
        } else {
            System.out.println("Nom: " + nom + " " + optionalPrenom.get());
        }
    }

    //option2: syntaxe recommandée: gérer le params optionnel dans la méthode

    public static void imprimerNom(String nom, String prenomOptionnel) {

        Optional<String> op = Optional.ofNullable(prenomOptionnel); //le prénom n'est pas recquis : peut être null lors de l'appelle de la méthode
        if (op.isPresent()) {
            System.out.println("Nom: " + nom + " Prénom: " + op.get());
        } else {
            System.out.println("Nom: " + nom);
        }
    }
//
//    public static int sum(int x, int y){
//        return x + y;
//    }
//
//    public static int sum(int x, int y, int z){
//        return x + y + z;
//    }

    /*
    méthode avec un nombre variable de params
     */

    public static int sum(int... entiers) {
        //il s'agit d'une collection d'entiers
        int s = 0;
        for (int e : entiers) {
            s += e;
        }
        return s;
    }

    /*
    méthode récursive
     */

    public static int calculateFactorial(int i){
        if(i == 0){
            return 1;
        }else{
            return i * calculateFactorial(i - 1);
        }
    }

    private static boolean isPositif(int x){
        return x > 0;
    }

    public static int sommePositive(int x, int y){
        if(isPositif(x) && isPositif(y)){
            return x+y;
        }else{
            return 0;
        }
    }
}
