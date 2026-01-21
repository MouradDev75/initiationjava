package principal;

import entities.A;
import entities.C;

public class App {
    public static void main(String[] args) {

        A a = new A();
        a.x = 321;
        a.methodA();
        System.out.println(">> "+a.x);
    }
}
