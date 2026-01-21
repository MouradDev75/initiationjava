package tp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws Exception{

        //pour les lectures à partir de la console:
        /*
        soit la classe Scanner, soit la BufferedReader
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        IPersonnel service = null;

        System.out.println("""
                1- tableau: tapez t
                2- fichier: tapez f
                """);

        String choice = reader.readLine();

        switch (choice){
            case "t":
                service = new Personnel(10);
                break;
            case "f":
                service = new PersonnelFichier("employes.txt");
                break;
            default:
                System.out.println("invalide............");
                break;
        }

        while (true) {

            System.out.println("""
                    Menu:
                    1- Ajouter un employé
                    2- Afficher le salaire de chaque employé
                    3- Afficher le salaire moyen des employés
                    4- Quitter
                    """);

            String choix = reader.readLine();

            if(choix.equals("4")){
                System.out.println("Fin du programme.....");
                break;
            }

            switch (choix){

                case "1":
                    System.out.println("Nom:");
                    String nom = reader.readLine();

                    System.out.println("Prénom:");
                    String prenom = reader.readLine();

                    System.out.println("Age:");
                    int age = Integer.parseInt(reader.readLine());

                    System.out.println("Date entrée:");
                    String dateEntree = reader.readLine();

                    System.out.println("""
                            pour vendeur: tapez v
                            pour représentant: tapez r
                            pour technicien: tapez t
                            pour manutentionnaire: tapez m
                            """);

                    String typeEmploye = reader.readLine();

                    double ca;
                    Employe e = null;

                    switch (typeEmploye){
                        case "v":
                            System.out.println("chiffre d'affaire: ");
                            ca = Double.parseDouble(reader.readLine());
                            e = new Vendeur(nom,prenom,age,dateEntree,ca);
                            break;

                        case "r":
                            System.out.println("chiffre d'affaire: ");
                            ca = Double.parseDouble(reader.readLine());
                            e = new Representant(nom,prenom,age,dateEntree,ca);
                            break;

                        case "t":
                            System.out.println("Unités: ");
                            double unites = Double.parseDouble(reader.readLine());
                            e = new Technicien(nom,prenom,age,dateEntree,unites);
                            break;

                        case "m":
                            System.out.println("Heures: ");
                            double heures= Double.parseDouble(reader.readLine());
                            e = new Manutentionnaire(nom,prenom,age,dateEntree,heures);
                            break;
                    }

                    service.ajouterEmploye(e);
                    System.out.println("employé ajouté.........");
                    break;

                case "2":
                    service.calculerSalaires();
                    break;

                case "3":
                    System.out.println("Le salaire moyen est de: "+service.salaireMoyen());
                    break;

                default:
                    System.out.println("Choix invalide........");
                    break;
            }

        }
    }
}
