package principal;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        /*
        Généricité: mécanimse permettant d'exprimer des classes, des interfaces ou des méthodes qui sont identiques sur le plan algorithmiques
        mais qui diffèrent sur la base du type
         */

        MyClasse<String> m1 = new MyClasse<>();
        m1.a = "a";
        m1.b = "b";
        m1.permute();

        MyClasse<Integer> m2 = new MyClasse<>();
        m2.a = 10;
        m2.b = 15;
        m2.permute();

        List<User> users = new ArrayList<>();
        users.add(new User("Jean", 45));
        users.add(new User("Marie", 37));

        SerialServiceGeneric.exportBin("c:\\rep\\users.bin", users);

    }
}
