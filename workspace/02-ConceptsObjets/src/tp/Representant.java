package tp;

public class Representant extends Commercial{

    private static double PRIME_REPRENSENTANT = 800;
    private static double POURCENT_REPRENSENTANT = 0.2;

    public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree,chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return getChiffreAffaire() * Representant.POURCENT_REPRENSENTANT + Representant.PRIME_REPRENSENTANT;
    }

    @Override
    public String getTitre() {
        return "Le représentant ";
    }
}
