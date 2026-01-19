package conditions;

public class App {

    public static void main(String[] args) {
        /*
        bloc conditionnel: est un ensemble qui s'exécute que si une condition est vérifiée
         */
        System.out.println("***** if, else if, else");

        int age = 22;

        if (age < 18) {
            System.out.println("mineur");
        } else if (age <= 25) {
            System.out.println("jeune adulte");
        }else{
            System.out.println("adulte");
        }

        System.out.println("****** opérateur ternaire:");
        // (condition)? valeur_si_vraie : valeur_si_fausse
        // syntaxe pratique pour faire des affectations conditionnelles

        int y = 10, z = 15;
        String resultat = (y > z) ? "vraie" : "fausse";
        System.out.println("résultat = "+resultat);

        System.out.println("************ switch case:");

        int note = 10;

        switch (note){
            case 0:
                System.out.println("nulle.......");
                break;
            case 10:
                System.out.println("juste la moyenne");
                break;
            default:
                System.out.println("bon résultat.....");
                break;
        }

        /*
        depuis la version 13 de java: ajout du switch expression
         */

        int experience = 3;

        switch (experience){
            case 1,2 -> {
                System.out.println("débutant");
                System.out.println("junior");
            }
            case 3,4 -> System.out.println("confirmé ou sénior");
            case 5 -> System.out.println("expert");
            default -> System.out.println("valeur expérience invalide.........");
        }
        /*
        on a la possibilité d'affecter le résultat du switch expression à une variable
         */

        String result = switch (experience){
            case 1, 2 -> "début ou junior";
            case 3,4-> "confirmé ou sénior";
            case 5 -> "expert";
            default -> "valeur invalide........";
        };

        System.out.println(result);



    }
}
