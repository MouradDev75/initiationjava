package entities;

public class A {

    /*
    visibilité des attributs d'une classe
    default: aucune visibilité mentionnée: visibles uniquement par les classes du mm package
    public: visible par l'ensemble des packages et classes
    private: visibles uniquement dans leur classes
    protected: visibles par les classes filles et les autres classes du mm package
     */

    public int x = 0;

    public void methodA(){
        B b = new B();
        x = 123;
        for (int i = 0; i < 200; i++) {
            x++;
        }
        b.methodB(this);
    }
}
