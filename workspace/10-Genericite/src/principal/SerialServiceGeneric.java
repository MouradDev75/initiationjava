package principal;

import com.google.gson.Gson;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerialServiceGeneric {

    //sérialisation binaire

    public static <T> void exportBin(String chemin, List<T> lst){

        try{

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(chemin));
            oos.writeObject(lst);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //désérialisation binaire

    public static <T> List<T> importBin(String chemin){

        List<T> lst = new ArrayList<>();

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(chemin));
            lst = (List<T>) ois.readObject();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lst;

    }

    //sérialisation xml
    public static <T> void exportXml(String chemin, List<T> lst){
        try{
            XMLEncoder xml = new XMLEncoder(new FileOutputStream(chemin));
            xml.writeObject(lst);
            xml.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //désérialiation xml
    public static <T> List<T> importXml(String chemin){
        List<T> lst = new ArrayList<>();
        try{
            XMLDecoder xml = new XMLDecoder(new FileInputStream(chemin));
            lst = (List<T>) xml.readObject();
            xml.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lst;
    }

    //sérialisation json
    public static <T> void exportJson(String chemin, List<T> lst){
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

    public static <T> List<T> importJson(String chemin, Class<T> clazz){

        ArrayList<T> tab = new ArrayList<>();

        try{
            Gson gson = new Gson();

            FileReader fr = new FileReader(chemin);

            ArrayList fromJson = gson.fromJson(fr, tab.getClass());

            for(Object o : fromJson){
                String objetStr = gson.toJson(o);
                tab.add(gson.fromJson(objetStr, clazz));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return tab;
    }
}
