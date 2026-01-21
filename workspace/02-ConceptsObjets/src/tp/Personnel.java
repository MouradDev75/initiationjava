package tp;

public class Personnel implements IPersonnel {

    private Employe[] employes;
    private int maxEmploye;
    private int nbEmploye = 0;

    public Personnel(int maxEmploye){
        this.maxEmploye = maxEmploye;
        this.employes = new Employe[maxEmploye];
    }

    @Override
    public void ajouterEmploye(Employe e){

        ++nbEmploye;
        if(nbEmploye <= maxEmploye){
            employes[nbEmploye - 1] = e;
        }else{
            System.out.println("Pas plus de "+maxEmploye+" d'employés.");
        }

    }

    @Override
    public void calculerSalaires(){
        for (int i = 0; i < nbEmploye; i++) {
            System.out.println(employes[i].getNom()+" gagne "+employes[i].calculerSalaire()+" euros.");
        }
    }

    @Override
    public double salaireMoyen(){
        double somme = 0;
        for (int i = 0; i < nbEmploye; i++) {
            somme += employes[i].calculerSalaire();
        }
        return somme / nbEmploye;
    }
}
