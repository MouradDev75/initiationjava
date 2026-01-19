package boucles;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
        bloc itératif: ensemble d'instructions répététif:
        - for: si le nombre d'itérations est connu
        - while (do while): si nombre d'itérations non connu, mais bloc dépendant de conditions
        - for each: permettant de parcourir tous les éléments d'une collection (du premier au dernier)
         */

        System.out.println("******** boucle for:");

        //afficher hello 5 fois
        for (int i = 1; i < 6; i++) {
            System.out.println("hello");
        }

        System.out.println("********* boucle for each:");

        int[] tab = {10,20,30};

        for(int i : tab){
            System.out.println(i);
        }

        System.out.println("****** while et do while:");

        int x = 0;

        // affichez bonjour tant que x est inférieur 5

        //while:

        while (x < 5){
            System.out.println("bonjour");
            x++;
        }

        //do while: s'exécute au moins une fois

        do{
            System.out.println("bonjour");
            x++;
        }while (x < 10);

        // demandez la saisie d'un nombre compris entre 1 et 10. Tant que le nombre saisi n'est pas valide, redemandez
        //un autre

        Scanner sc = new Scanner(System.in);

        System.out.println("** boucle infinie:");
        while(true){
            System.out.println("nombre entre 1 et 10: ");
            int nb = sc.nextInt();
            if(nb >= 1 && nb <= 10){
                break;
            }
        }

        System.out.println("*** boucle finie:");

        int number = 0;
        while( !( number >= 1 && number <= 10 )){
            System.out.println("number: ");
            number = sc.nextInt();
        }

        System.out.println("********* break et continue:");

        int[] nombres = {1,4,5,17,12,42,3,8,9,10};
        //affichez uniquement les nombres pairs et quittez la boucle si le nombre pair est 8
        for(int n : nombres){
            if (n % 2 != 0){
                continue; // force le passage à l'itération suivante -> la suite de la boucle n'est pas exécutée
            }
            System.out.println(n);
             if(n == 8){
                 break;
            }
        }

    }
}
