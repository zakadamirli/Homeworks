package MentorDay19;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Integer, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProduct_ID(), product);
    }

    public Product getProduct(int productID) throws ProductNotFoundException {
        Product product = products.get(productID);
        if (product == null) {
            throw new ProductNotFoundException("Product not found: " + productID);
        }
        return product;
    }
}
