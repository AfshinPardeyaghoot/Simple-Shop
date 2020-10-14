public abstract class Product {

    String name ;
    int value ;
    int count ;

    public Product(String name, int value , int count) {
        this.name = name;
        this.value = value;
        this.count = count ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
