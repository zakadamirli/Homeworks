package MentorDay24.UniqueProductCatalog;

public class ProductCatalogManager {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product product1 = new Product("Samsung S24", 2400, "Electronics");
        Product product2 = new Product("Samsung S24+", 2700, "Electronics");
        Product product3 = new Product("Samsung S24 ultra", 3200, "Electronics");

        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);

        catalog.printCatalog();

        System.out.println("Contains \"Samsung S24+\" ? " + catalog.containsProduct("Samsung S24+"));

        catalog.removeProduct("Samsung S24 ultra");
        catalog.printCatalog();

    }
}
