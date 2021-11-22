package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.AcousticGuitar;
import stock.instruments.InstrumentType;
import stock.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", 4000, 4872, "polished ebony", "black", InstrumentType.KEYBOARD, "grand");

    }

    @Test
    public void hasAbrand(){
        assertEquals("Yamaha", piano.getbrand());
    }

    @Test
    public void hasACostPrice(){
        assertEquals(4000, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(4872, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAMaterial(){
        assertEquals("polished ebony", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasPianoType(){
        assertEquals("grand", piano.getPianoType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(872, piano.calculateMarkup(), 0.01);
    }
}
