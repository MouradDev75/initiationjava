package tableaux;

public class App {

    public static void main(String[] args) {

        /*
        Array: il s'agit d'un tablau statique
         */

        int[] tab = new int[3]; // tableau de 3 cases
        tab[0] = 10;
        tab[1] = 20;
        tab[2] = 30;

        //si le contenu du tableau est connu d'avance:
       int[] tab2 = {10,20,30};

       //parcourir un tableau:

        //for each: pour chaque élément dans le tableau tab2
        System.out.println("********** for each:");
        for (int element : tab2){
            System.out.println(element);
        }

        //for:
        System.out.println("*********** for:");
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

        //while:
        System.out.println("********* while:");

        int taille = tab.length;
        int index = 0;

        while(index < taille){
            System.out.println(tab[index]);
            index++;
        }

        System.out.println("****** tableau à 2 dimensions");
        //tableau de tableaux
        int[][] matrice = new int[2][];
        matrice[0] = new int[2];
        matrice[1] = new int[3];

        matrice[0][0] = 10;
        matrice[0][1] = 20;

        int[][] myMatrice = { { 10,20 } , { 30,40,50 } };

        //parcourir myMatrice:

        //fixer les lignes
        for (int ligne = 0; ligne < myMatrice.length; ligne++) {
            //for pour fixer les colonnes
            for (int colonne = 0; colonne < myMatrice[ligne].length; colonne++) {
                System.out.println(myMatrice[ligne][colonne]);
            }
        }

    }
}
