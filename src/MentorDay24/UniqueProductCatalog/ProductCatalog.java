package MentorDay24.UniqueProductCatalog;

import java.util.HashSet;
import java.util.Set;

public class ProductCatalog {
    Set<Product> products;

    public ProductCatalog() {
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        if (products.contains(product)) {
            System.out.println(product.getName() + " this product is already in stock");
        } else {
            products.add(product);
            System.out.println("Product added: " + product.getName());
        }
    }

    public void removeProduct(String productName) {
        Product productRemove = products.stream().filter(product ->
                product.getName().equals(productName)).findFirst().orElse(null);
        if (productRemove != null) {
            products.remove(productRemove);
            System.out.println("Product removed: " + productRemove);
        } else {
            System.out.println(productName + " product not found");
        }
    }

    public boolean containsProduct(String productName) {
        return products.stream().anyMatch(product -> product.getName().equals(productName));
    }

    public void printCatalog() {
        if (products.isEmpty()) {
            System.out.println("This catalog is empty");
        } else {
            System.out.println("Product Catalog: ");
            products.forEach(System.out::println);
        }
    }
}
