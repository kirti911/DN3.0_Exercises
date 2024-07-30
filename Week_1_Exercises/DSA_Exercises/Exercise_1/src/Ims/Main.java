package Ims;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("1", "Product A", 10, 100.0);
        Product product2 = new Product("2", "Product B", 20, 150.0);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        inventory.displayProducts();

        Product updatedProduct = new Product("1", "Product A+", 15, 110.0);
        inventory.updateProduct(updatedProduct);

        inventory.displayProducts();

        inventory.deleteProduct("2");

        inventory.displayProducts();
    }
}