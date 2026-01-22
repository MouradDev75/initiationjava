package principal;

public class MyClasse<T> {

    public T a;
    public T b;

    public void permute(){
        T tmp = a;
        a = b;
        b = tmp;
    }
}
