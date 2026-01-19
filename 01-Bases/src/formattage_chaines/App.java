package formattage_chaines;

public class App {

    public static void main(String[] args) {
        int age = 35;
        String prenom = "Jean";

        // chaine à afficher: Prenom: Jean Age: 35

        System.out.println("***** concaténation:");

        System.out.println("Prenom: "+prenom+" Age: "+age);

        System.out.println("***** utiliser la méthode format de la classe String:");

        //lien doc: https://www.w3schools.com/java/ref_string_format.asp
        String resultat = String.format("Prénom: %s Age: %d",prenom,age);

        System.out.println(resultat);

        System.out.println("******* utiliser la méthode printf");
        //syntaxe simpifiée de String.format()

        System.out.printf("Prénom: %s Age: %d",prenom,age);

        System.out.println("******** caractères d'echappement:");

        /*
        \n: retour à la ligne
        \t: tabulation
        \s: space
        \b: back space
        \\
        \"
         */

        //syntaxe pratique pour des chaines multilignes
        System.out.println("\tceci est une chaine\nsur plusieurs\nlignes.");

        //syntaxe pratique pour la gestion des chemins
        String chemin = "c:\\test\\notes.txt";
        System.out.println(chemin);

        System.out.println("ceci est 'un' \"paragraphe\"");

        /*
        Depuis Java ajout de text block: gestion des chaines multilignes -> ou chaines verbatimes
         */

        String menu = """
                    ceci est un
                texte sur plusieurs
                lignes
                """;

        System.out.println(menu);
    }
}
