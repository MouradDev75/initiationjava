package principal;

public class Test {

    //y est une variable globale, pas besoin de l'initialiser car elle possède une valeur par défaut
    /*
    types numériques: = 0 par défaut
    type boolean: = false
    types complexes: = null
     */

    int y;

    public void mInstance(){

        //x est une variable locale qui doit être initialisée
        int x = 1;

        System.out.println(y);

        System.out.println(x);
    }

    public static void mClasse(){

    }
}
