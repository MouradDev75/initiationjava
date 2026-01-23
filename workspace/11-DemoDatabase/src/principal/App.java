package principal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws Exception{
        /*
        pour interagir avec un bd à partir d'un code Java, on utiliser le driver JDBC (Java Database Connector) spécifique à chaque
        database.
        1- créer une base de données + une table
        2- télécharger le driver depuis maven repository et l'ajouter au projet
         */
        // params de connexion à la database
//        String url = "jdbc:mariadb://localhost:3306/formation";
//        String user = "root";
//        String password = "";

        //lectureDatabase();
        transaction();


    }//fin du main

    static void insertData() throws Exception {
        //lecture d'un fichier .properties:
        Properties p = new Properties();
        p.load(new FileInputStream("config.properties"));

        String url = p.getProperty("url");
        String user = p.getProperty("user");
        String password = p.getProperty("password");

        //Etape1: se connecter à la database
        Connection cnx = DriverManager.getConnection(url,user,password);

        //Etape2: commande sql

        //objet nécessaire pour exécuter des cmds sql
        //statement n'autorise pas es cmds sql paramétrées
        // Statement st = cnx.createStatement();


        //String sql = "insert into personne(nom) values ('FEDERER')";

        //risque d'une injection sql car a méthode prends en param une cmd sql
        //st.executeUpdate(sql);

        //pour se protéger contre ce type d'attaque, utilisez une cdm sql paramétrée en utilisant le PreparedStatement
        //cmd paramétrée: est  précompilée, mémoire chargée en attente de params
        String sql = "insert into personne(nom) values (?)";
        PreparedStatement ps = cnx.prepareStatement(sql);
        ps.setString(1,"NADAL");

        ps.executeUpdate();
        ps.close();
        cnx.close();
    }

    static void lectureDatabase() throws Exception{

        Properties p = new Properties();
        p.load(new FileInputStream("config.properties"));

        String url = p.getProperty("url");
        String user = p.getProperty("user");
        String password = p.getProperty("password");

        //Etape1: se connecter à la database
        Connection cnx = DriverManager.getConnection(url,user,password);

        //Etape2: commande sql

        //objet nécessaire pour exécuter des cmds sql
        //statement n'autorise pas es cmds sql paramétrées
        // Statement st = cnx.createStatement();


        //String sql = "insert into personne(nom) values ('FEDERER')";

        //rsique d'une injection sql car a méthode prends en param une cmd sql
        //st.executeUpdate(sql);

        //pour se protéger contre ce type d'attaque, utilisez une cdm sql paramétrée en utilisant le PreparedStatement
        //cmd paramétrée: est  précompilée, mémoire chargée en attente de params
        String sql = "select * from personne"; // select nom from personne
        PreparedStatement ps = cnx.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

       while(rs.next()){
            System.out.println("Id: "+rs.getInt("id")+" Nom: "+rs.getString("nom"));
        }

        rs.close();
        ps.close();
        cnx.close();

    }

    static void transaction(){

        Connection cnx = null;

        try{
            Properties p = new Properties();
            p.load(new FileInputStream("config.properties"));

            String url = p.getProperty("url");
            String user = p.getProperty("user");
            String password = p.getProperty("password");

            //Etape1: se connecter à la database
            cnx = DriverManager.getConnection(url,user,password);

            //activer le mode transactionnel
            cnx.setAutoCommit(false); //par défaut = true > les modifs sont appliquées en bd

            String sql = "insert into personne(nom) values (?)";
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1,"DJOKOVIC");

            ps.executeUpdate();

            String sql1 = "insert into personne(nom) values (?)";
            ps = cnx.prepareStatement(sql1);
            ps.setString(1,"SAFIN");

            ps.executeUpdate();





            cnx.commit(); //le commit valide toutes les cmds sql
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            try {
                cnx.rollback(); //le rollback annule toutes les cmds sql
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }
}
