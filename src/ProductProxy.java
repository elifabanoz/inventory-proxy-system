public class ProductProxy implements Product {
    private String productId;
    private String productType;
    private Product realProduct;
    private boolean isLoaded;
    private DatabaseService dbService;
    
    public ProductProxy(String id, String type) {
        this.productId = id;
        this.productType = type;
        this.isLoaded = false;
        this.dbService = new DatabaseService();
    }
    
    private void loadProduct() {
        if (!isLoaded) {
            realProduct = dbService.loadProduct(productId, productType);
            isLoaded = true;
        }
    }
    
    private Product getRealProduct() {
        loadProduct();
        return realProduct;
    }
    
    @Override
    public String getId() {
        return getRealProduct().getId();
    }
    
    @Override
    public String getName() {
        return getRealProduct().getName();
    }
    
    @Override
    public double getPrice() {
        return getRealProduct().getPrice();
    }
    
    @Override
    public double getQuantity() {
        return getRealProduct().getQuantity();
    }
    
    @Override
    public String getCategory() {
        return getRealProduct().getCategory();
    }
    
    @Override
    public Image getImage() {
        return getRealProduct().getImage();
    }
    
    @Override
    public String getDetails() {
        return getRealProduct().getDetails();
    }
}
