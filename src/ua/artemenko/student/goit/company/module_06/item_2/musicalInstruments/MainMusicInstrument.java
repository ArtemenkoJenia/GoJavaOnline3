package ua.artemenko.student.goit.company.module_06.item_2.musicalInstruments;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainMusicInstrument {
    public static void main(String[] args) {
        Guiter[] guiter = new Guiter[20];
        for (int i = 0; i < guiter.length; i++) {
            guiter[i] = new Guiter("Guiter",25.5);
        }
        Trumpet[] trumpet = new Trumpet[30];
        for (int i = 0; i < trumpet.length; i++) {
            trumpet[i] = new Trumpet("Trumpet",1200.0);
        }
        Piano[] piano = new Piano[8];
        for (int i = 0; i < piano.length; i++) {
            piano[i] = new Piano("Piano",5000.0);
        }

        MusicStore musicStore = new MusicStore(guiter,trumpet,piano);

        System.out.println("В наличии Guiter " + musicStore.catalog.get("Guiter").size());
        System.out.println("В наличии Trumpet " + musicStore.catalog.get("Trumpet").size());
        System.out.println("В наличии Piano " + musicStore.catalog.get("Piano").size());
        System.out.println();

        Map<String,Integer> order = new HashMap<>();
        order.put("Guiter",-10);
        order.put("Trumpet",5);
        order.put("Piano",5);
        order.put("Violin",10);

        System.out.println("Получен заказ");

        show(order);

        System.out.println("Заказ проверяется");
        System.out.println();

        musicStore.orderChecks(order);

        System.out.println("Заказ проверен и откоректирован");

        show(order);

        System.out.println();

        List<MusicalInstrument> orderReceived = musicStore.prepareInstruments(order);
        System.out.println("В магазине осталось");
        System.out.println("Guiter " + musicStore.catalog.get("Guiter").size());
        System.out.println("Trumpet " + musicStore.catalog.get("Trumpet").size());
        System.out.println("Piano " + musicStore.catalog.get("Piano").size());
    }
    private static void show(Map<String,Integer> order) {
        System.out.println();
        Set<Map.Entry<String, Integer>> setHelp = order.entrySet();
        for (Map.Entry<String, Integer> setHelpIter : setHelp) {
            System.out.println(setHelpIter.getKey() + " " + setHelpIter.getValue());
        }
        System.out.println();
    }
}
