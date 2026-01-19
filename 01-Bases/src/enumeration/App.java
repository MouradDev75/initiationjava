package enumeration;

import enumeration.enums.Autorisation;
import enumeration.enums.Erreur;
import enumeration.enums.Profil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
    public String nom;
    public Profil profil;
    public List<Autorisation> autorisations = new ArrayList<>();
}

public class App {

    /*
    pour déclarer une enum:
    1- on peut le faire dans une classe
    2- on peut le faire dans un fichier à part (voir package enums)
     */

    //enum non public, visible uniquement dans cette classe (concerne cette classe uniquement)
    enum Priority{
        HIGH,
        MEDIUM,
        LOW
    }


    public static void main(String[] args) {
        //enum: fonctionne comme un tableau. Il s'agit d'une liste de valeurs constantes

        Priority p = Priority.HIGH;
        System.out.println(p); //affiche la valeur constante

        Erreur e1 = Erreur.MAJEURE;

        //les éléments d'une enum, possède aussi un index (appelé ordinal) comme dans une tableau

        System.out.println("index de CRITIQUE dans l'enum: "+Erreur.CRITIQUE.ordinal());

        System.out.println("quel est le code de votre erreur (0,1 ou 2)? ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        Erreur er = Erreur.values()[code];
        System.out.println(er);

        //conversion d'une enum en tableau
        Erreur[] erreurs = Erreur.values();

        for(Erreur e : erreurs){
            System.out.println(e);
        }

        User u = new User();
        u.nom = "DUPONT";
        u.profil = Profil.MANAGER;
        u.autorisations.add(Autorisation.ECRITURE);
        u.autorisations.add(Autorisation.SUPPRESSION);

        if(u.autorisations.contains(Autorisation.SUPPRESSION)){
            System.out.println("suppresion OK.......");
        }else{
            System.out.println("Action interdite...........");
        }


    }
}
