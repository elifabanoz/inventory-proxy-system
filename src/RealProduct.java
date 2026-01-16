public abstract class RealProduct implements Product {
    protected String id;
    protected String name;
    protected double price;
    protected int quantity;
    protected String category;
    protected Image image;
    
    public RealProduct(String id) {
        this.id = id;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public double getQuantity() {
        return quantity;
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public Image getImage() {
        return image;
    }
    
    @Override
    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + 
               ", Quantity: " + quantity + ", Category: " + category;
    }
}
