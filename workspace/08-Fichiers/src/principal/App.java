package principal;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        /*
        Java propose un ensemble de classes permettant de manipuler es fichiers.
        Stream(flux): une sorte de canal intermédiaire entre une source et une destination
        Java propose 2 types de flux:
        - flux binaire: lecture/écriture char/char: FileInputSteam, FileOutputStream
        - flux caractères: lecture/écriture ligne/ligne: FileReader, FileWriter (BufferedReader,BufferedWriter)
        - classe File permettant de manipuler des fichiers et des répertoires
         */

        //création d'un fichier
        File f = new File("test.txt"); //chemin relatif
        try {
            f.createNewFile();
        } catch (IOException e) {
           e.printStackTrace();
        }

        File f1 = new File("c:\\rep\\test.txt"); //chemin absolut
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //création d'un dossier
        File dossier = new File("rep1\\rep2");
        dossier.mkdirs();
        //dossier.mkdir(); 1 seul rep

        FileService.scanRep("c:\\rep");

        try {
            FileService.ecritureFichierTexte("c:\\rep\\demo.txt", "contenu du fichier......",true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String contenu = FileService.lectureFichierTexte("c:\\rep\\demo.txt");
            System.out.println(contenu);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileService.copy("c:\\rep\\demo.txt", "c:\\rep\\copie.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
