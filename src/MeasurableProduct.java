public class MeasurableProduct extends RealProduct {
    private int weight;
    private String unit;
    
    public MeasurableProduct(String id) {
        super(id);
        this.name = "Measurable Product";
        this.price = 20.0;
        this.quantity = 3.5;
        this.category = "Measurable";
        this.image = new Image("measurable.jpg");
        this.weight = 500;
        this.unit = "grams";
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getUnit() {
        return unit;
    }
}
