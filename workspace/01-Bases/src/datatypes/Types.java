package datatypes;

import java.util.Scanner;

public class Types {
    // commentaire sur une ligne
    /*
    conventions de nommages:
    PascalCase: MaClasse: s'applique aux classes
    camelCase: maClasse: s'applique: aux variables et méthodes
    snake_case: convention utilisée par python
     */

    /*
    types de base (types simples - types valeurs): entiers, réels, bool, char, string
    entiers: byte (8 bits), short (16 bits), int (32 bits), long (64 bits)
    réels: float (32 bits), double (64 bits)
    char: codé sur 16 bits
    bool: 8 bits (1 octet)

    types complexes (types réferences): dates, tableaux, classe et objet
     */

    /*
    Variable: est une zone mémoire contenant une valeur typée
     */
    // java utilise le typage statique: on doit spécifier le type d'une variable


    //main: est le point d'entrée d'une application console
    public static void main(String[] args) {

        //variable:
        byte myByte = 5;
        short myShort =15;
        int myInt = 10;
        long myLong = 35;

        float myFloat = 15.5f;
        double myDouble = 35.2d;

        char myChar = 'c';
        boolean myBoolean = true; //ou false

        String s = "ceci est une chaine";

        System.out.println(myFloat);

        //constante: est une variable dont le contenu n'est pas modifiable
        //convention de nommage: le nom d'une constante est en majuscules
        final int HAUTEUR = 35;
        //HAUTEUR = 45; erreur de compilation

        //variables nulles:
        /*
        par définition les types simples ne sont pas nullables
        types wrapper: pour chaque simple, un type complexe lui est associé
        int    Integer
        char   Character
        byte   Byte
        float  Float
        boolean Boolean
        double  Double

        les types wrapper permettant 2 choses:
        définir des types simples nullables
        pouvoir faire des conversions
         */
        Integer age = null;
        Boolean b = null;


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("*************** conversion de types:");

        // conversion implicite: concerne le passage d'un type inférieur à un type supérieur

        byte b1 = 15;
        int i1 = b1;


        // conversion explicite: concerne le passage d'un supérieur à un type inférieur avec un risque de perte de données
        //option1: utiliser le cast : (int), (double), (byte)..........

        int x = 15;
        byte z = (byte) x;

        // conversion de types non compatibles:
        String c = "25";
        int y = Integer.parseInt(c);

        double d = 11.6;
        String resultat = String.valueOf(d);

        char l = 'A';
        int j = l; //code ascii du char qui est utilisé

        System.out.println(j);
        System.out.println(l);

        int u = 85;
        char r = (char) u;

        System.out.println(r);

        System.out.println("************* Math.random()");
        int aleatoire = (int) (Math.random() * 100); //entier aléatoire entre 0 et 100

        System.out.println(aleatoire);

        System.out.println("******* lecture depuis la console:");

        Scanner sc = new Scanner(System.in);
        System.out.println("votre âge: ");
        int saisie = sc.nextInt();
        System.out.println(saisie);

    }




}
