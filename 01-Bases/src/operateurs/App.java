package operateurs;

public class App {

    public static void main(String[] args) {

        System.out.println("************* opérateurs arithmétiques:");

        int i = 10, j = 3;

        int somme = i+j;
        int soustraction = i-j;
        int multiplication = i  *j;
        int division = i / j;
        int modulo = i % j;

        System.out.println(somme);
        System.out.println(soustraction);
        System.out.println(multiplication);
        System.out.println(division); //division entière car i et j sont des int
        System.out.println(modulo);

        double x = 10, y = 3;
        System.out.println(x / y); //division classique

        System.out.println("****** incrémentation et décrémentation:");

        int n = 10, z = 11;
        System.out.println(n++); // post incrémentation
        System.out.println(++z); // pré incrémentation

        n += 5; //raccourcis de : n = n + 5
        n *= 2;
        n -= 3;

        System.out.println("************ opérateurs de comparaison:");
        // >, >=, <, <=, == (égalité), != (différent): renvoient un boolean

        System.out.println("*********** opérateurs logiques:");
        // && (et logique), || (ou logique), ! (non logique): renvoient un boolean

    }
}
