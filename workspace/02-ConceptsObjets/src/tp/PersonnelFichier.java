package tp;

public class PersonnelFichier implements IPersonnel{

    private String cheminFichier;

    public PersonnelFichier(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    @Override
    public void ajouterEmploye(Employe e) {

    }

    @Override
    public void calculerSalaires() {

    }

    @Override
    public double salaireMoyen() {
        return 0;
    }
}
