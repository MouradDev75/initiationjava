package principal;

public class App {

    public static void main(String[] args) {
        String s = "test"; //possibilité de créer une chaine sans faire appelle au constructeur: via une chaine litterale
        s = s.concat("e");
        System.out.println(s); //le type String par définition est immuable

        System.out.println("******* quelques méthodes du type String:");
        String chaine = " ceci est une chaine ";

        System.out.println("taille: "+chaine.length());
        System.out.println(chaine.isEmpty());
        System.out.println(chaine.contains("ceci")); //true
        System.out.println(chaine.startsWith("ceci")); //false
        System.out.println(chaine.endsWith("chaine ")); //true
        System.out.println(chaine.trim()); //suppression des espaces en début et en fin de chaine
        System.out.println(chaine.replace('a', 'e'));
        System.out.println(chaine.replace("une chaine", "un paragraphe"));
        System.out.println(chaine.substring(6)); //du 6ème au dernier char
        System.out.println(chaine.substring(6, 10));
        System.out.println(chaine.charAt(1)); //char index 1
        System.out.println(chaine.toCharArray()); //conversion en tableau de char

        System.out.println("***** split:");

        String texte = "mot1;mot2;mot3";
        String[] mots = texte.split(";");
        for(String m : mots){
            System.out.println(m);
        }

        String str = "word1 word2,word3:word4;word5";

        String[] tab = str.split("[ ,:;]");
        for(String st : tab)
        {
            System.out.println(st);
        }

        System.out.println("****** join:");
        String phrase = String.join(" ", mots);
        System.out.println(phrase);

        System.out.println(String.join("-", "ceci","est","un","exemple"));

        System.out.println("******* StringBuilder:");
        //contrairement au type String, le type StringBuilder est muable
        StringBuilder sb = new StringBuilder();
        sb.append("test");
        sb.append("e");
        sb.append(" ");
        sb.append("String Builder");

        System.out.println(sb); // chaine non vide, car StringBuilder muable

        String myStr = "";
        myStr.concat("test");
        myStr.concat("e");
        myStr.concat(" ");
        myStr.concat("String");
        System.out.println(myStr); //chaine vide car String non muable


    }
}
