package ua.artemenko.student.goit.company.modul_03.flower;

/**
 * Created by Женя on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Rose roseOne = new Rose("Rose","RED",SizeFlower.Large);
        Rose roseTwo = new Rose("Rose","YELLOW",SizeFlower.Large);
        Tulip tulip = new Tulip("Tulip","BLUE",SizeFlower.Small);
        Chamomile chamomile = new Chamomile("Chamomile","WHITE",SizeFlower.Medium);
        Aster aster = new Aster("Aster","WHITE",SizeFlower.Large);

        BouquetOfFlowers bouquet = new BouquetOfFlowers();
        bouquet.addAllFlowers(roseOne,roseTwo,tulip,chamomile,aster);
        for (Flower flower:bouquet.getBouquetOfFlowers()){
            System.out.printf("%s %s %s%n",flower.getName(),flower.getColor(),flower.getSize().toString());
        }
        System.out.println();

        bouquet.removeFlowersInBouquet("Rose");
        bouquet.removeFlowersInBouquet("Rose");
        bouquet.removeFlowersInBouquet("Gladiolus");
        System.out.println();

        for (Flower flower:bouquet.getBouquetOfFlowers()){
            System.out.printf("%s %s %s%n",flower.getName(),flower.getColor(),flower.getSize().toString());
        }

        RoseBush roseBush = new RoseBush(5,"Red",SizeFlower.Medium);


    }
    void showInfoBouquet(){

    }
}
