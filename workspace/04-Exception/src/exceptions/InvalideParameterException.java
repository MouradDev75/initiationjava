package exceptions;

/*
pour créer des exceptions personnalisées:
1- hériter de la classe Exception
2- appeler le constructeur de la classe supérieur et lui fournir un message de type string
 */

public class InvalideParameterException extends Exception{

    public InvalideParameterException(String message){
        super(message);
    }

}
