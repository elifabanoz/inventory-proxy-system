public class BarcodedProduct extends RealProduct {
    private String barcode;
    
    public BarcodedProduct(String id) {
        super(id);
        this.name = "Barcoded Product";
        this.price = 15.0;
        this.quantity = 10;
        this.category = "Barcoded";
        this.image = new Image("barcoded.jpg");
        this.barcode = "123456789";
    }
    
    public String getBarcode() {
        return barcode;
    }
}
