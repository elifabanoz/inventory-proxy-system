public class DatabaseService {
    
    public Product loadProduct(String id, String type) {
        System.out.println("Loading product from database: " + id);
        
        if (type.equals("countable")) {
            return new CountableProduct(id);
        } else if (type.equals("measurable")) {
            return new MeasurableProduct(id);
        } else if (type.equals("barcoded")) {
            return new BarcodedProduct(id);
        }
        
        return null;
    }
    
    public Image loadProductImage(String id) {
        System.out.println("Loading image from database for product: " + id);
        return new Image("product_" + id + ".jpg");
    }
}
