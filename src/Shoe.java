public class Shoe extends Product{

    private String model ;
    private String color ;
    private int size ;


    public Shoe(String name, int value, String model, String color, int size) {
        super(name, value);
        this.model = model;
        this.color = color;
        this.size = size;
    }
}
