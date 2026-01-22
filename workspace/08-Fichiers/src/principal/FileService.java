package principal;

import java.io.*;

public class FileService {

    public static void scanRep(String chemin){
        File f = new File(chemin);
        if(f.exists()){

            if(f.isDirectory()){
                File[] files = f.listFiles();
                for(File fl : files){
                    if(fl.isFile()){
                        System.out.println("Fichier: "+fl.getName());
                    }else{
                        System.out.println("Rép: "+fl.getName());
                        scanRep(fl.getAbsolutePath());
                    }
                }

            }else{
                System.out.println("Fichier: "+f.getName());
            }

        }else{
            f.mkdir();
        }
    }

    //méthode de lecture ligne/ligne
    public static String lectureFichierTexte(String chemin) throws Exception{
        String contenu = "";
        File f = new File(chemin);
        if(f.exists()){

            FileReader fr = new FileReader(f);
            /*
            bonne pratique: utiliser un buffer pour des questions de performences
             */

            BufferedReader br = new BufferedReader(fr, 16384);
            String ligne = br.readLine();
            while(ligne != null){
                contenu += ligne+"\n";
                ligne = br.readLine();
            }

            fr.close();
            return contenu;
        }else{
            throw new Exception("Chemin invalide.......");
        }
    }

    //méthode d'écriture ligne/ligne
    public static void ecritureFichierTexte(String chemin, String contenu, boolean modeAjout) throws  Exception{
        File f = new File(chemin);
        if(f.exists()){

            if(modeAjout){
                contenu += "\n"+contenu;
            }

            FileWriter fw = new FileWriter(f,modeAjout);
            BufferedWriter bw = new BufferedWriter(fw, 16384);
            bw.write(contenu);

            bw.close();
            fw.close();

        }else{
            throw new Exception("Chemin invalide............");
        }
    }

    //méthode de copie d'un fichier
    /*
    lecture et écriture binaire
     */
    public static void copy(String cheminSource, String cheminDestination) throws Exception{

        File f = new File(cheminSource);
        if(f.exists()){

            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(cheminDestination);

            int c = fis.read(); //renvoie le code ascii du char lu

            while(c != -1){
                fos.write(c);
                c = fis.read();
            }

            fis.close();
            fos.close();

        }else{
            throw new Exception("Chemin invalide..........");
        }

    }
}
