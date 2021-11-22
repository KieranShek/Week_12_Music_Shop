package stock.accessories;

public class SheetMusic extends Accessory{

    public SheetMusic(String brand, double costPrice, double sellingPrice) {
        super(brand, costPrice, sellingPrice);

    }


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
