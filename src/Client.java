public class Client {
    
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");
        
        // Create proxy objects - real products are not loaded yet
        Product product1 = new ProductProxy("P001", "countable");
        Product product2 = new ProductProxy("P002", "measurable");
        Product product3 = new ProductProxy("P003", "barcoded");
        
        System.out.println("Proxies created, but real products not loaded yet.\n");
        
        // Display product 1 - triggers loading
        System.out.println("--- Displaying Product 1 ---");
        displayProductDetails(product1);
        
        System.out.println("\n--- Displaying Product 2 ---");
        displayProductDetails(product2);
        
        System.out.println("\n--- Displaying Product 3 ---");
        displayProductDetails(product3);
        
        System.out.println("\n--- Accessing Product 1 again (already loaded) ---");
        displayProductDetails(product1);
    }
    
    public static void displayProductDetails(Product p) {
        System.out.println(p.getDetails());
        System.out.println("Image: " + p.getImage().getImagePath());
    }
}
