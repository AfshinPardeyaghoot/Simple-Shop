import java.util.List;

public class Cart {

    private Client client ;
    private List<Shoe> shoes ;
    private List<Book> books ;
    private List<Electronic> electronics ;

    public Cart(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(List<Shoe> shoes) {
        this.shoes = shoes;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Electronic> getElectronics() {
        return electronics;
    }

    public void setElectronics(List<Electronic> electronics) {
        this.electronics = electronics;
    }
}
