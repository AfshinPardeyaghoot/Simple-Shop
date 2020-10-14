public class Book extends Product {

    private String Writer ;
    private String publisher ;


    public Book(String name, int value, String writer, String publisher) {
        super(name, value);
        Writer = writer;
        this.publisher = publisher;
    }
}
