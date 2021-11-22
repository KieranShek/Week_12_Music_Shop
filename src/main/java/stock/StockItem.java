package stock;

import behaviours.ISell;

public abstract class StockItem implements ISell {

    private String brand;
    private double costPrice;
    private double sellingPrice;

    public StockItem(String brand, double costPrice, double sellingPrice) {
        this.brand = brand;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getbrand() {
        return brand;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }


}
