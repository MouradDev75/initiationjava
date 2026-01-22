package principal;

import com.google.gson.Gson;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerialisationService {

    //sérialisation binaire

    public static void exportBin(String chemin, List<Produit> lst){

        try{

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(chemin));
            oos.writeObject(lst);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //désérialisation binaire

    public static List<Produit> importBin(String chemin){

        List<Produit> lst = new ArrayList<>();

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(chemin));
            lst = (List<Produit>) ois.readObject();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lst;

    }

    //sérialisation xml
    public static void exportXml(String chemin, List<Produit> lst){
        try{
            XMLEncoder xml = new XMLEncoder(new FileOutputStream(chemin));
            xml.writeObject(lst);
            xml.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //désérialiation xml
    public static List<Produit> importXml(String chemin){
        List<Produit> lst = new ArrayList<>();
        try{
            XMLDecoder xml = new XMLDecoder(new FileInputStream(chemin));
            lst = (List<Produit>) xml.readObject();
            xml.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lst;
    }

    //sérialisation json
    public static void exportJson(String chemin, List<Produit> lst){
        try{

            Gson gson = new Gson();
            FileWriter fw = new FileWriter(chemin);
            gson.toJson(lst, fw);
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //désérialisation json:

    public static List<Produit> importJson(String chemin){
        List<Produit> lst = new ArrayList<>();

        try{
            Gson gson = new Gson();

            FileReader fr = new FileReader(chemin);
            Produit[] tab = gson.fromJson(fr, Produit[].class);

            lst = Arrays.asList(tab); //conversion d'un tableau en liste

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lst;
    }
}
