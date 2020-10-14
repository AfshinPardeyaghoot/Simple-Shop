public class Shoe extends Product{

    private String model ;
    private String color ;
    private int size ;


    public Shoe(String name, int value, int count, String model, String color, int size) {
        super(name, value, count);
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
