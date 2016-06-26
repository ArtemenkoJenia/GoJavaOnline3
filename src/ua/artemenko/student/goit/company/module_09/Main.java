package ua.artemenko.student.goit.company.module_09;

import ua.artemenko.student.goit.company.module_09.fileSystem.AudioFile;
import ua.artemenko.student.goit.company.module_09.fileSystem.ImageFile;
import ua.artemenko.student.goit.company.module_09.fileSystem.MyFile;
import ua.artemenko.student.goit.company.module_09.fileSystem.TextFile;
import ua.artemenko.student.goit.company.module_09.flower.*;
import ua.artemenko.student.goit.company.module_09.musicalInstruments.Guiter;
import ua.artemenko.student.goit.company.module_09.musicalInstruments.MusicalInstrument;
import ua.artemenko.student.goit.company.module_09.musicalInstruments.Piano;
import ua.artemenko.student.goit.company.module_09.musicalInstruments.Trumpet;
import ua.artemenko.student.goit.company.module_09.processData.PrintCollection;
import ua.artemenko.student.goit.company.module_09.processData.SortCollection;
import ua.artemenko.student.goit.company.module_09.subsidiary.AbstractAuxiliary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<MyFile> collectionFile =
                new ArrayList<>(Arrays.asList(new AudioFile("Metallica - Ride The Lightning", 5756, ".mp3"),
                                            new AudioFile("Ultimate Oceans - Watching You...", 55756, ".aac"),
                                            new AudioFile("Ultimate Oceans - Galaxies", 5556, ".ffr"),
                                            new AudioFile("Ultimate Oceans - Galaxies", 5556, ".aac"),
                                            new AudioFile("Wavestar - Voyager", 7756, ".aac"),
                                            new AudioFile("Wavestar - Cabala", 9756, ".mp3"),
                                            new AudioFile("Ariana Grande - Into You", 3756, ".FLAC"),
                                            new TextFile("Statement", 235, ".txt"),
                                            new TextFile("Statement", 235, ".doc"),
                                            new TextFile("Statement", 555, ".txt"),
                                            new TextFile("Application", 235, ".txt"),
                                            new TextFile("TextFile", 235, ".doc"),
                                            new ImageFile("Foto", 5675, ".jpg"),
                                            new ImageFile("Image", 8675, ".png"),
                                            new ImageFile("Image", 10675, ".png"),
                                            new ImageFile("Image", 10675, ".ai"),
                                            new ImageFile("Picture", 3675, ".png"),
                                            new ImageFile("Picture", 3675, ".png")));
        SortCollection.insertSortArray(collectionFile, MyFile.compar);


        List<Flower> collectionFlower =
                new ArrayList<>(Arrays.asList(new Rose("RED", SizeFlower.Large),
                                            new Rose("YELLOW", SizeFlower.Large),
                                            new Rose("WHITE", SizeFlower.Large),
                                            new Rose("BLUE", SizeFlower.Large),
                                            new Rose("BLACK", SizeFlower.Large),
                                            new Rose("PINK", SizeFlower.Large),
                                            new Tulip("BLUE", SizeFlower.Small),
                                            new Chamomile( "WHITE", SizeFlower.Medium),
                                            new Aster("WHITE", SizeFlower.Large)));
        SortCollection.insertSortArray(collectionFlower, Flower.compar);


        List<MusicalInstrument> collectionInstrument =
                new ArrayList<>(Arrays.asList(new Guiter("Guiter", 25.5),
                                            new Trumpet("Trumpet", 1200.0),
                                            new Trumpet("Trumpet", 1300.0),
                                            new Trumpet("Trumpet", 1200.0),
                                            new Piano("Piano", 5300.0),
                                            new Piano("Piano", 4000.0),
                                            new Piano("Piano", 800.0),
                                            new Piano("Piano", 5000.0)));
        SortCollection.insertSortArray(collectionInstrument, MusicalInstrument.compar);


        PrintCollection.printList(collectionFile);
        PrintCollection.printList(collectionFlower);
        PrintCollection.printList(collectionInstrument);

        AbstractAuxiliary.encrypt = true;

        PrintCollection.printList(collectionFile);
        PrintCollection.printList(collectionFlower);
        PrintCollection.printList(collectionInstrument);

        AbstractAuxiliary.encrypt = false;

        PrintCollection.printList(collectionFile);
        PrintCollection.printList(collectionFlower);
        PrintCollection.printList(collectionInstrument);

    }
}
