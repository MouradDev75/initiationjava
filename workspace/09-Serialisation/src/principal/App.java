package principal;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        Sérialisation: mécanisme permettant de sauvegarder l'état d'un objet dans un support physique de persistence (fichier, bd....)
        3 types de sérialisation:
        binaire: ObjectOutputStream - ObjectInputStream
        xml: XMLEncoder - XMLDecoder
        json: pas de classe fournit -> solution: utilisez des bibliothèques externes (Gson, Jackson) depuis Maven Repository

         */
        List<Produit> prods = new ArrayList<>();

        prods.add(new Produit(1, "PC Dell", 1500));
        prods.add(new Produit(2, "Ecran HP", 79));

        System.out.println("******** Sérialisation binaire:");
        SerialisationService.exportBin("c:\\rep\\produits.bin", prods);

        for(Produit p :  SerialisationService.importBin("c:\\rep\\produits.bin")){
            System.out.println(p);
        }

        System.out.println("**************** Sérialisation xml:");
        SerialisationService.exportXml("c:\\rep\\produits.xml", prods);

        for(Produit p : SerialisationService.importXml("c:\\rep\\produits.xml")){
            System.out.println(p);
        }

        System.out.println("*************** Sérialisation json:");
        SerialisationService.exportJson("c:\\rep\\produits.json", prods);

        for(Produit p : SerialisationService.importJson("c:\\rep\\produits.json")){
            System.out.println(p);
        }
    }
}
