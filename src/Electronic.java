public class Electronic extends Product{

    private String brand ;


    public Electronic(String name, int value, int count, String brand) {
        super(name, value, count);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
