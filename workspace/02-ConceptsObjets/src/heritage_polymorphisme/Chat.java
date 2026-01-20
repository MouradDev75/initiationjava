package heritage_polymorphisme;

public class Chat extends Animal{

    private String couleur;

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Chat(String nom, int age, String couleur){
        super(nom,age);
        this.couleur = couleur;
    }

    public Chat(){
    }

    public void dormir(){
        System.out.println("Chat: dormir...........");
    }

    @Override
    public void emettreSon() {
        System.out.println("miauller..............");
    }
}
