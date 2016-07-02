package ua.artemenko.student.goit.company.module_11.module_09.processData;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.ImageFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.MyFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.TextFile;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorClassName;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorFileName;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorFileSize;
import ua.artemenko.student.goit.company.module_11.module_09.fileSystem.comparator.ComparatorFileSpecification;
import ua.artemenko.student.goit.company.module_11.module_09.flower.*;
import ua.artemenko.student.goit.company.module_11.module_09.flower.comparator.ComparatorColorFlower;
import ua.artemenko.student.goit.company.module_11.module_09.flower.comparator.ComparatorNameFlower;
import ua.artemenko.student.goit.company.module_11.module_09.flower.comparator.ComparatorSizeFlower;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.Guiter;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.MusicalInstrument;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.Piano;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.Trumpet;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.comparatorMusicInstrument.ComparatorInstrumentValue;
import ua.artemenko.student.goit.company.module_11.module_09.musicalInstruments.comparatorMusicInstrument.ComparatorMusic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class SortCollectionTest {

    private List<MyFile> collectionFile;
    private Comparator<MyFile> comparFile;
    private MyFile auFile1 = new AudioFile("Metallica - Ride The Lightning", 7756, ".mp3");
    private MyFile auFile2 = new AudioFile("Ultimate Oceans - Watching You...", 55756, ".aac");
    private MyFile auFile3 = new AudioFile("Ultimate Oceans - Galaxies", 5556, ".ffr");
    private MyFile auFile4 = new AudioFile("Metallica - Ride The Lightning", 6756, ".mp3");

    private List<Flower> collectionFlower;
    private Comparator<Flower> comparFlower;
    private Flower flFile1 = new Rose("RED", SizeFlower.Large);
    private Flower flFile2 = new Rose("YELLOW", SizeFlower.Large);
    private Flower flFile3 = new Tulip("BLUE", SizeFlower.Small);
    private Flower flFile4 = new Aster("RED", SizeFlower.Small);

    private List<MusicalInstrument> collectionInstrument;
    private Comparator<MusicalInstrument> comparInstrument;
    private MusicalInstrument miFile1 = new Guiter("Guiter", 25.5);
    private MusicalInstrument miFile2 = new Trumpet("Trumpet", 1200.0);
    private MusicalInstrument miFile3 = new Piano("Piano", 800.0);
    private MusicalInstrument miFile4 = new Piano("Piano", 5000.0);



    @Before
    public void setUp() throws Exception {
        collectionFile = new ArrayList<>(Arrays.asList(auFile1,auFile2,auFile3,auFile4));
        comparFile = new ComparatorClassName().thenComparing(new ComparatorFileName()).
                thenComparing(new ComparatorFileSize()).
                thenComparing(new ComparatorFileSpecification());

        collectionFlower = new ArrayList<>(Arrays.asList(flFile1,flFile2,flFile3,flFile4));
        comparFlower = new ComparatorNameFlower().
                thenComparing(new ComparatorColorFlower()).
                thenComparing(new ComparatorSizeFlower());

        collectionInstrument = new ArrayList<>(Arrays.asList(miFile1,miFile2,miFile3,miFile4));
        comparInstrument = new ComparatorMusic().
                thenComparing(new ComparatorInstrumentValue());

    }

    @Test
    public void insertSortArray() throws Exception {

        SortCollection.insertSortArray(collectionFile,comparFile);
        Assert.assertTrue(collectionFile.get(0).equals(auFile4));
        Assert.assertTrue(collectionFile.get(1).equals(auFile1));
        Assert.assertTrue(collectionFile.get(2).equals(auFile3));
        Assert.assertTrue(collectionFile.get(3).equals(auFile2));

        SortCollection.insertSortArray(collectionFlower,comparFlower);
        Assert.assertTrue(collectionFlower.get(0).equals(flFile4));
        Assert.assertTrue(collectionFlower.get(1).equals(flFile1));
        Assert.assertTrue(collectionFlower.get(2).equals(flFile2));
        Assert.assertTrue(collectionFlower.get(3).equals(flFile3));

        SortCollection.insertSortArray(collectionInstrument,comparInstrument);
        Assert.assertTrue(collectionInstrument.get(0).equals(miFile1));
        Assert.assertTrue(collectionInstrument.get(1).equals(miFile3));
        Assert.assertTrue(collectionInstrument.get(2).equals(miFile4));
        Assert.assertTrue(collectionInstrument.get(3).equals(miFile2));


    }

}


















