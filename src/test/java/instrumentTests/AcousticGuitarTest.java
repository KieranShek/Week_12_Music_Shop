package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.AcousticGuitar;
import stock.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("Fender", 1900, 2499, "rosewood", "brown", InstrumentType.GUITAR, 6);

    }

    @Test
    public void hasAbrand(){
        assertEquals("Fender", acousticGuitar.getbrand());
    }

    @Test
    public void hasACostPrice(){
        assertEquals(1900, acousticGuitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(2499, acousticGuitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAMaterial(){
        assertEquals("rosewood", acousticGuitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", acousticGuitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, acousticGuitar.getInstrumentType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, acousticGuitar.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("-guitar noise-", acousticGuitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(599, acousticGuitar.calculateMarkup(), 0.01);
    }




}
