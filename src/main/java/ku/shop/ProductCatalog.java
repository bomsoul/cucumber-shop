package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price,int quantity) {
        Product product = new Product(name,price);
        product.stock(quantity);
        products.put(name, product);
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public Product getProduct(int quantity ,String name) {
        Product product = products.get(name);
        product.buy(quantity);
        return product;
    }
}
