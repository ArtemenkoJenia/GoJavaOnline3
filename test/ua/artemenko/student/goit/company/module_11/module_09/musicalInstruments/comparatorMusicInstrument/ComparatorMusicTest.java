package ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.comparatorMusicInstrument;

import org.junit.Assert;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.MusicalInstrument;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.Piano;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.Trumpet;

import static org.junit.Assert.*;

public class ComparatorMusicTest {
    @Test
    public void compare() throws Exception {
        MusicalInstrument instrument1 = new Trumpet("Trumpet", 1200.0);
        MusicalInstrument instrument2 = new Piano("Trumpet", 1200.0);
        ComparatorMusic comparator = new ComparatorMusic();
        comparator.compare(instrument1,instrument2);
        Assert.assertTrue(comparator.compare(instrument1,instrument2)==0);
    }

    @Test
    public void compareLess() throws Exception {
        MusicalInstrument instrument1 = new Trumpet("Trumpet", 1200.0);
        MusicalInstrument instrument2 = new Piano("Piano", 5300.0);
        ComparatorMusic comparator = new ComparatorMusic();
        comparator.compare(instrument1,instrument2);
        Assert.assertTrue(comparator.compare(instrument1,instrument2)>0);
    }

    @Test
    public void compareMore() throws Exception {
        MusicalInstrument instrument1 = new Trumpet("Piano", 8200.0);
        MusicalInstrument instrument2 = new Piano("Trumpet", 5300.0);
        ComparatorMusic comparator = new ComparatorMusic();
        comparator.compare(instrument1,instrument2);
        Assert.assertTrue(comparator.compare(instrument1,instrument2)<0);
    }

}