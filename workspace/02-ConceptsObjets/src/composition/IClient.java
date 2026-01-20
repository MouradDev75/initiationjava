package composition;

public interface IClient {

    //CRUD: create - read - update - delete

    /*
    c'est pseudo classe abstraite qui ne contient que des méthodes abstraites, et eventuellement des contantes
     */
    final int HAUTEUR = 10;
    void insert(Client c);
    void delete(Client c);
    void update(Client c);
}
