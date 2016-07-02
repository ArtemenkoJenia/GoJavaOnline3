package ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicalInstrumentTest {
    private MusicalInstrument instrument1;
    private MusicalInstrument instrument2;
    private MusicalInstrument instrument3;
    private  String strCheck1 = "|Trumpet|        1200.0|";
    private  String strCheck2 = "|NotName|        1200.0|";

    @Before
    public void setUp() throws Exception {
        instrument1 = new Trumpet("Trumpet", 1200.0);
        instrument2 = new Trumpet(null, 1200.0);
        instrument3 = new Trumpet("Trumpet", 1200.0);
    }


    @Test
    public void getNameMusicalInstrument() throws Exception {
        Assert.assertTrue(instrument1.getNameMusicalInstrument().equals("Trumpet"));
    }

    @Test
    public void setNameMusicalInstrument() throws Exception {
        instrument1.setNameMusicalInstrument("Piano");
        Assert.assertTrue(instrument1.getNameMusicalInstrument().equals("Piano"));
    }

    @Test
    public void getValueMusicalInstrument() throws Exception {
        Assert.assertTrue(instrument1.getValueMusicalInstrument()== 1200);
    }

    @Test
    public void setValueMusicalInstrument() throws Exception {
        instrument1.setValueMusicalInstrument(200);
        Assert.assertTrue(instrument1.getValueMusicalInstrument()==200);
    }

    @Test
    public void setValueMusicalInstrumentNegative() throws Exception {
        instrument1.setValueMusicalInstrument(-200);
        Assert.assertTrue(instrument1.getValueMusicalInstrument() == 0);
    }


    @Test
    public void objectToStringBuilder() throws Exception {
        Assert.assertTrue(instrument1.toString().equals(strCheck1));
        Assert.assertTrue(instrument2.toString().equals(strCheck2));
    }

    @Test
    public void equalsTrue() throws Exception {
        Assert.assertTrue(instrument1.equals(instrument3));

    }
    @Test
    public void equalsFalse() throws Exception {
        Assert.assertFalse(instrument1.equals(instrument2));
    }

    @Test
    public void hashCodeTestFalse() throws Exception {
        Assert.assertFalse(instrument1.hashCode()== instrument2.hashCode());
    }

    @Test
    public void hashCodeTestTrue() throws Exception {
        Assert.assertTrue(instrument1.hashCode()== instrument3.hashCode());
    }


}