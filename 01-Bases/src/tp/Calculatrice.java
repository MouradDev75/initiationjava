package tp;

import java.util.Scanner;

public class Calculatrice {
    /*
    Tant que le choix est différent de q, l'application continue son exécution
    Si choix saisi invalide, redemandez un autre
    Si choix est valide, demandez la saisie de 2 nombres doubles et affichez le résultat
    Le programme doit gérer le cas d'une division par 0
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Choisir une opération:
                    
                    - Addition: tapez a
                    - Soustraction: tapez s
                    - Multiplication: tapez m
                    - Division: tapez d
                    - Quitter: tapez q
                    """);

            String choix = sc.nextLine();

            //gestion de la boucle infinie
            if(choix.equals("q")){
                System.out.println("fin du programme.....");
                break;
            }

            //gestion d'un choix invalide
            while(!(choix.equals("a") || choix.equals("m") || choix.equals("s") || choix.equals("d"))){
                System.out.println("choix invalide. Donnez un autre choix: ");
                choix = sc.nextLine();
            }

            //demandez 2 nombres doubles
            System.out.println("Nombre1 :");
            double nb1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nombre2 :");
            double nb2 = sc.nextDouble();
            sc.nextLine();

            //gestion de la division par 0
            if(choix.equals("d") && nb2 == 0){
                System.out.println("Attention, division par 0");
                while(nb2 == 0){
                    System.out.println("Nombre2 différent de 0: ");
                    nb2 = sc.nextDouble();
                    sc.nextLine();
                }
            }

            switch (choix){
                case "a":
                    System.out.println(nb1+ " + "+nb2+" = "+(nb1+nb2));
                    break;

                case "s":
                    System.out.println(nb1+ " - "+nb2+" = "+(nb1-nb2));
                    break;

                case "m":
                    System.out.println(nb1+ " x "+nb2+" = "+(nb1*nb2));
                    break;

                case "d":
                    System.out.println(nb1+ " / "+nb2+" = "+(nb1/nb2));
                    break;
            }
        }
    }
}
