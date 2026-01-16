public class CountableProduct extends RealProduct {
    private int unitCount;
    
    public CountableProduct(String id) {
        super(id);
        this.name = "Countable Product";
        this.price = 10.0;
        this.quantity = 5;
        this.category = "Countable";
        this.image = new Image("countable.jpg");
        this.unitCount = 100;
    }
    
    public int getUnitCount() {
        return unitCount;
    }
}
