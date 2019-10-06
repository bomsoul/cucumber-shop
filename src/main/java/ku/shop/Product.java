package ku.shop;

public class Product {
    private double price;
    private String name;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be not be negative zero");
        this.price = price;
    }

    public int getQuantity() { return quantity; }

    public void stock(int quantity){
        if (quantity < 0)
            throw new IllegalArgumentException("quantity must be positive");
        this.quantity += quantity;
    }

    public void buy (int quantity){
        if (quantity > this.quantity)
            throw new IllegalArgumentException("Insufficient product quantity");
        if (quantity < 0)
            throw new IllegalArgumentException("Product quantity must be positive");
        this.quantity -= quantity;
    }
}
