package stock.instruments;

public class AcousticGuitar extends Instrument{

    private int noOfStrings;

    public AcousticGuitar(String brand, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, int noOfStrings) {
        super(brand, costPrice, sellingPrice, material, colour, instrumentType);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {return "-guitar noise-";}


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
