package accessoriesTests;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.InstrumentCase;


import static org.junit.Assert.assertEquals;

public class InstrumentCaseTest {

    InstrumentCase instrumentCase;

    @Before
    public void before(){
        instrumentCase = new InstrumentCase("Violin Case", 105, 135);
    }

    @Test
    public void hasbrand(){
        assertEquals("Violin Case", instrumentCase.getbrand());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(105, instrumentCase.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(135, instrumentCase.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, instrumentCase.calculateMarkup(), 0.01);
    }

}


