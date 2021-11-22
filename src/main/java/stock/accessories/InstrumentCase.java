package stock.accessories;

public class InstrumentCase extends Accessory{

    public InstrumentCase(String brand, double costPrice, double sellingPrice) {
        super(brand, costPrice, sellingPrice);

    }


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
