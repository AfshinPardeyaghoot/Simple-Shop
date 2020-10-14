public class Book extends Product {

    private String Writer ;
    private String publisher ;

    public Book(String name, int value, int count, String writer, String publisher) {
        super(name, value, count);
        Writer = writer;
        this.publisher = publisher;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
