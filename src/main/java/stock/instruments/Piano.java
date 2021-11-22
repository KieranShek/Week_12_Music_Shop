package stock.instruments;

public class Piano extends Instrument {

    private String pianoType;

    public Piano(String brand, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, String pianoType) {
        super(brand, costPrice, sellingPrice, material, colour, instrumentType);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play() {
        return "-piano noise-";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }

}
