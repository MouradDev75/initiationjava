package principal;

import exceptions.InvalideParameterException;

public class App {

    public static void main(String... args)  {
        /*
        il existe 3 types d'erreurs possibles:
        - erreurs de syntaxe (de compilation): elles sont détectées automatiquement par l'IDE
        - Exception: erreur qui provoque l'arrêt de l'application
        - code fonctionnel, qui renvoi un résultat inattendu
         */

        /*
        pour éviter l'arrêt de l'application, une exception doit être gérée.
        pour gérer une exception, on utilise le bloc try/catch
        il existe plusieurs types d'exceptions, chacune d'elle porte le nom de l'erreur qu'elle génère. Il existe aussi un type
        anonyme (générique) Exception qui est la classe mère de toutes les exceptions
         */

        int x = 10;
        int[] tab = {10,20};

        /*
        Obligation: une ressource doit être libérée fermée à la fin de son utilisation.
        Bonne pratique: prévoir un try/catch lors de manipulation de ressources
         */



        try {
            System.out.println(x / 2);
            System.out.println(tab[0]);
            //ouverture d'un fichier

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }finally {
            //bloc optionnel qui s'execute tout le temps
            System.out.println("**** bloc finally.........");
            //fichier.close()
            //sert dans la pratique à libérer les ressources utilisée dans le try
        }

//        }catch (ArithmeticException e){
//            System.out.println("bloc catch........");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//        }

        try {
            divide(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //remplir un fichier de logs...
            //remplir une table de logs.....
        }

        try {
            convertStringToInt("123");
        } catch (InvalideParameterException e) {
            System.out.println(e.getMessage());
        }

        try {
            convertStringToInt("123x");
        } catch (InvalideParameterException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----- suite du script...........");

    }//fin main

    /**
     *
     * @param x est une entier
     * @throws Exception
     */
    public static void divide(int x) throws Exception {
        //option1: la méthode gère sa propre exception
//        try {
//            System.out.println(10 / x);
//        } catch (Exception e) {
//            System.out.println("exception gérée par la méthode............");
//        }
        //option2: faire une remontée d'exception - c'est l'appelant qui doit gérer l'exception
        if(x != 0){
            System.out.println(10/x);
        }else{
            //throw permet de déclencher une exception
            throw new Exception("attention, division par 0......");
        }
    }

    /**
     * méthode de conversion d'une chaine en int.
     * @param parameter chaine contenant un nombre entier
     * @throws InvalideParameterException
     */
    public static void convertStringToInt(String parameter) throws InvalideParameterException {

        try{
            System.out.println("conversion en int: "+Integer.parseInt(parameter));
        }catch (Exception e){
            throw new InvalideParameterException("paramètre invalide.........");
        }

    }
}

