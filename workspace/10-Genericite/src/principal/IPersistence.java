package principal;

public interface IPersistence<T> {
    void add(T obj);
    void delete(T obj);
    void update(T obj);
}
