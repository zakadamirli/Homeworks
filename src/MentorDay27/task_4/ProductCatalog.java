package MentorDay27.task_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProductCatalog {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Computer", 1200.00, "Electronics"),
                new Product("iphone", 2800.00, "Electronics"),
                new Product("Desk Chair", 150.00, "Furniture"),
                new Product("Notebook", 5.00, "Stationery"),
                new Product("Coffee Maker", 50.00, "Appliances"),
                new Product("Blender", 30.00, "Appliances")
        );

        List<Product> electronics = products.stream()
                .filter(p -> "Electronics".equals(p.getCategory()))
                .toList();

        List<Product> sortedByPrice = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("All products:");
        products.forEach(System.out::println);

        System.out.println("\nElectronics products:");
        electronics.forEach(System.out::println);

        System.out.println("\nProducts sorted by price:");
        sortedByPrice.forEach(System.out::println);
    }
}

