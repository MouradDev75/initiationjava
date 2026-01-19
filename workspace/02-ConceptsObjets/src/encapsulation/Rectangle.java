package encapsulation;

public class Rectangle {

    private double hauteur;
    private double largeur;
    private int age;

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 60)
            this.age = age;
        else
            System.out.println("Age doit être entre 18 et 60.....");
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        if(hauteur < 0){
            System.out.println("hauteur doit être positive.....");
        }else {
            this.hauteur = hauteur;
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface(){
        return hauteur * largeur;
    }

    public Rectangle(double hauteur, double largeur) {
        setHauteur(hauteur);
        setHauteur(largeur);
    }

    public Rectangle() {
    }
}
