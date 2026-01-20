package encapsulation;

import java.util.Objects;

/*
le numéro d'un compte doit contenir au min 6 char
 */
public class CompteBancaire{

    //attributs
    private String numero;
    private double solde;

    private static String banque = "BNP";

    public static String getBanque() {
        return banque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero.length() >= 6) {
            this.numero = numero;
        }else {
            System.out.println("Numéro doit contenir 6 char au minimum.....");
        }
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public CompteBancaire() {
    }

    //méthodes:
    public void depot(double montant){
        this.solde += montant;
    }

    public void retrait(double montant){
        if(this.solde >= montant){
            this.solde -= montant;
        }else{
            System.out.println("Solde insuffisant.......");
        }
    }

    public static void changerBanque(String nomBanque){
        banque = nomBanque;
    }

    //méthode permettant de personnaliser l'affichage d'un objet: choisir les attributs à afficher
    @Override
    public String toString() {
        return "Numéro: "+this.numero+" Solde: "+this.solde;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CompteBancaire that = (CompteBancaire) o;
        return this.numero.equals(that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    //destructeur: méthode appelée lors du passage du garbage collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Compte bancaire "+this.numero+" détruit en mémoire.....");
        //pratique pour faire des sauvegardes: suavegarder un objet avant sa destruction
    }
}
