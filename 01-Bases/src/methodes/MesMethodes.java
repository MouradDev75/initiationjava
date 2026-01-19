package methodes;

public class MesMethodes {
    /*
    pour définir une méthode, une classe est nécessaire
    Syntaxe: visibilité [static] void_ou_type_de_retour nomMethode(params) {instructions;}

    une classe peut contenir 2 types de méthodes:
    - méthode d'instance: est accéssible via une instance de la classe
    - méthode de classe (static): accéssible via la classe. NomClasse.nomMethode()

     */

    //méthode non static, donc méthode d'instance

    /**
     *
     */
    public void afficher(){
        System.out.println("méthode afficher.........");
    }

    //méthode de classe:

    /**
     * Méthode qui renvoie la somme de 2 entiers
     * @author Mourad
     * @param x est un entier
     * @param y est entier
     * @return somme de x et y
     */
    public static int somme(int x, int y){
        return x + y;
    }

    /*
    surcharger une méthode (overload): c'est pouvoir définir la même méthode dans la même en modifiant ses params soit en type, soit en nombre
     */

    public static int somme(int x, int y, int z){
        return x + y + z;
    }

    public static double somme(double x, double y){
        return x + y;
    }

    public static void afficher(int[] tab){
        for(int e : tab){
            System.out.println(e);
        }
    }

    //méthode qui renvoie la somme des éléments d'un tableau d'entiers

    //méthode qui renvoie la moyenne des éléments d'un tableau d'entiers

    //méthode qui renvoie l'élément le plus petit d'un tableau d'entiers

}
