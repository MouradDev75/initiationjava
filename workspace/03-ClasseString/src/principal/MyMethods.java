package principal;

public class MyMethods {

    //méthode qui renvoie le nombre de mots dans une chaine
    public static int nombreMots(String chaine){
        return chaine.trim().split("[ .,;!?:]").length;
    }

    //méthode qui renvoie l'inverse d'une chaine{

    public static String inverserChaine(String chaine){
        String chaineInversee = "";
        for (int i = chaine.length() - 1; i >= 0 ; i--) {
            chaineInversee += chaine.charAt(i);
        }
        return chaineInversee;

    }

    //méthode qui vérifie si une chaine est un palindrôme: sms, sos.....
    public static boolean verifPalindrome(String chaine){
        return chaine.equalsIgnoreCase(inverserChaine(chaine));
    }

}
