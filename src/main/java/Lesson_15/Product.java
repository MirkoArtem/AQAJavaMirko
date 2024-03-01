package Lesson_15;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = Double.parseDouble(price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{ id: " + id + " name: " + name + " price: " + price +  "} \n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product item)) return false;
        return item.id.equals(this.id) && item.name.equals(this.name) && item.price == this.price;
    }
}
