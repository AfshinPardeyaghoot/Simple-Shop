import org.w3c.dom.ls.LSInput;

import java.util.List;

public class Shop {

    private List<Book>  books;
    private List<Shoe> shoes ;
    private List<Electronic> electronics ;

    public  void fillShopProducts(){
        // define some book to add shop
        Book book1 = new Book("the man called ove",1300,4,"bekman","aso");
        Book book2 = new Book("blindness",4300,12,"bekman","aso");
        Book book3 = new Book("complete java reference",2400,7,"herbert shield","learn code");
        Book book4 = new Book("you do not know js",950,13,"jason","learn code");
        Book book5 = new Book("clean code",3300,2,"torvalds","learn code");

        //define some shoe to add shop
        Shoe shoe = new Shoe("nike",1200,20,"zoom" , "black" , 33);
        Shoe shoe1 = new Shoe("nike",1300,12,"zoom" , "white" , 34);
        Shoe shoe2 = new Shoe("nike",1000,4,"zoom" , "red" , 31);
        Shoe shoe3 = new Shoe("adidas",1800,20,"running" , "white" , 34);
        Shoe shoe4 = new Shoe("adidas",2000,20,"zx300" , "blue" , 31);
        Shoe shoe5 = new Shoe("adidas",2100,20,"zx300" , "black" , 33);
        Shoe shoe6 = new Shoe("puma",800,40,"free" , "blue" , 31);
        Shoe shoe7 = new Shoe("nike",830,30,"free" , "black" , 32);

        //define some electronic
        Electronic electronic = new Electronic("apple watch 5 series",2500,30,"apple");
        Electronic electronic1 = new Electronic("iphone 12 mini",699,20,"apple");
        Electronic electronic2= new Electronic("iphone 12",799,12,"apple");
        Electronic electronic3 = new Electronic("iphone 12 pro",999,21,"apple");
        Electronic electronic4 = new Electronic("iphone 12 pro max",1099,5,"apple");
        Electronic electronic5 = new Electronic("ps5",500,100,"playstation");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        shoes.add(shoe);
        shoes.add(shoe1);
        shoes.add(shoe2);
        shoes.add(shoe3);
        shoes.add(shoe4);
        shoes.add(shoe5);
        shoes.add(shoe6);
        shoes.add(shoe7);

        electronics.add(electronic);
        electronics.add(electronic2);
        electronics.add(electronic3);
        electronics.add(electronic1);
        electronics.add(electronic4);
        electronics.add(electronic5);

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(List<Shoe> shoes) {
        this.shoes = shoes;
    }

    public List<Electronic> getElectronics() {
        return electronics;
    }

    public void setElectronics(List<Electronic> electronics) {
        this.electronics = electronics;
    }
}
