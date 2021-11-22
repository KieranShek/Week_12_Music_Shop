package stock.accessories;

public class StringsPack extends Accessory {

    public StringsPack(String brand, double costPrice, double sellingPrice) {
        super(brand, costPrice, sellingPrice);

    }


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
