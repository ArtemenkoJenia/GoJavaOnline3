package ua.artemenko.student.goit.company.modul_03.flower;

import java.util.List;


public class MainFlower {
    public static void main(String[] args) {
        Rose roseOne = new Rose("Rose","RED",SizeFlower.Large);
        Rose roseTwo = new Rose("Rose","YELLOW",SizeFlower.Large);
        Tulip tulip = new Tulip("Tulip","BLUE",SizeFlower.Small);
        Chamomile chamomile = new Chamomile("Chamomile","WHITE",SizeFlower.Medium);
        Aster aster = new Aster("Aster","WHITE",SizeFlower.Large);

        BouquetOfFlowers bouquet = new BouquetOfFlowers();
        bouquet.addAllFlowers(roseOne,roseTwo,tulip,chamomile,aster);
        for (Flower flower:bouquet.getBouquetOfFlowers()){
            show(flower);
        }
        System.out.println();

        bouquet.removeFlowersInBouquet("Rose");
        bouquet.removeFlowersInBouquet("Rose");
        bouquet.removeFlowersInBouquet("Gladiolus");

        System.out.println();

        for (Flower flower:bouquet.getBouquetOfFlowers()){
            show(flower);
        }

        System.out.println();

        List<Flower> listFlower = bouquet.getAllFlowersWithName("Aster");
        if(listFlower.size() != 0)
        {
            for (int i = 0; i < listFlower.size(); i++) {
                show(listFlower.get(i));
            }
        }


        System.out.println();

        RoseBush roseBush = new RoseBush(5,"Red",SizeFlower.Medium);


    }

    static void show(Flower flower){
        System.out.printf("%s %s %s%n",flower.nameFlower,flower.colorFlower,flower.sizeFlower.toString());
    }
}
