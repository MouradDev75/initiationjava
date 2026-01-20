package heritage_polymorphisme;

public class Animal {

    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Animal() {
    }

    public void emettreSon(){
        System.out.println("Son de l'animal...........");
    }
}
