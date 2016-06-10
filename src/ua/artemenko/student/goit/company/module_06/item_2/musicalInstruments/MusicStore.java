package ua.artemenko.student.goit.company.module_06.item_2.musicalInstruments;


import ua.artemenko.student.goit.company.module_06.packageExcepcion.IncorrectValueException;
import ua.artemenko.student.goit.company.module_06.packageExcepcion.NoSuchProductExcepsion;

import java.util.*;

public class MusicStore {

    public Map<String, List<MusicalInstrument>> catalog;
    private List<MusicalInstrument> listGuiter;
    private List<MusicalInstrument> listTrumpet;
    private List<MusicalInstrument> listPiano;

    public MusicStore(Guiter[] guiter, Trumpet[] trumpet, Piano[] piano) {

        listGuiter = new ArrayList<>();
        addAlllInstrument(listGuiter, guiter);

        listTrumpet = new ArrayList<>();
        addAlllInstrument(listTrumpet, trumpet);

        listPiano = new ArrayList<>();
        addAlllInstrument(listPiano, piano);

        catalog = new HashMap<>();
        catalog.put("Guiter", listGuiter);
        catalog.put("Trumpet", listTrumpet);
        catalog.put("Piano", listPiano);
    }

    public void addAlllInstrument(List<MusicalInstrument> ob, MusicalInstrument... file) {
        for (MusicalInstrument help : file) {
            ob.add(help);
        }
    }

    public void addlInstrument(List<MusicalInstrument> ob, MusicalInstrument file) {
        ob.add(file);
    }

    public void removeMusicalInstrument(List<MusicalInstrument> ob, MusicalInstrument file) {
        ob.remove(file);
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {

        Set<Map.Entry<String, Integer>> setHelp = order.entrySet();
        Set<Map.Entry<String, List<MusicalInstrument>>> setHelpCatalog = catalog.entrySet();
        List<MusicalInstrument> finishedOrder = new ArrayList<>();

        for (Map.Entry<String, Integer> setHelpIter : setHelp) {
            for (Map.Entry<String, List<MusicalInstrument>> setHelpCatalogIter : setHelpCatalog) {
                if (setHelpIter.getKey().equals(setHelpCatalogIter.getKey())) {
                    for (int i = 0; i < setHelpIter.getValue(); i++) {
                        finishedOrder.add(setHelpCatalogIter.getValue().get(i));
                    }
                    for (int i = 0; i < setHelpIter.getValue(); i++) {
                        setHelpCatalogIter.getValue().remove(0);
                    }
                }
            }
        }
        return finishedOrder;
    }

    public void orderChecks(Map<String, Integer> order) {
        nameInstrumentChecks(order);
        numberChecksAndCorrection(order);
    }

    private void numberChecksAndCorrection(Map<String, Integer> order) {
        Set<Map.Entry<String, Integer>> setHelp = order.entrySet();
        Set<Map.Entry<String, List<MusicalInstrument>>> setHelpCatalog = catalog.entrySet();

        for (Map.Entry<String, Integer> setHelpIter : setHelp) {
            try {
                if (setHelpIter.getValue() <= 0) {
                    throw new NoSuchProductExcepsion("Вы ввели для " + setHelpIter.getKey() + " " + setHelpIter.getValue());
                }
            } catch (NoSuchProductExcepsion e) {
                System.out.println(e.getMessage());
                setHelpIter.setValue(correction(setHelpIter.getValue()));
            }
            for (Map.Entry<String, List<MusicalInstrument>> setHelpCatalogIter : setHelpCatalog) {
                try {
                    if (setHelpIter.getKey().equals(setHelpCatalogIter.getKey())) {
                        if (setHelpIter.getValue() > setHelpCatalogIter.getValue().size()) {
                            throw new IncorrectValueException("Не коректное значение.");
                        }
                    }
                } catch (IncorrectValueException e) {
                    System.out.println(e.getMessage());
                    System.out.println("В наличии на складе " + setHelpCatalogIter.getValue().size() + " " + setHelpCatalogIter.getKey());
                    setHelpIter.setValue(setHelpCatalogIter.getValue().size());
                }
            }
        }
    }

    private int correction(Integer result) {

            System.out.println("Наверное вы ошиблись.Колличество единиц товара не может быть отрицательным.Введите новое значение.");
            boolean flag = false;
            while (!flag) {
                Scanner scanner = new Scanner(System.in);
                String helpImput = scanner.next();
                try {
                    int newDouble = Integer.parseInt(helpImput);
                    System.out.println("Новое значение введено");
                    flag = true;
                    return newDouble;

                } catch (NumberFormatException n) {
                    System.out.println("Вы ввели не коректное значение . Попробуйте ещё раз");
                }
            }
        return result;
    }

    private void nameInstrumentChecks(Map<String, Integer> order) {
        Set<Map.Entry<String, Integer>> setHelp = order.entrySet();
        Set<Map.Entry<String, List<MusicalInstrument>>> setHelpCatalog = catalog.entrySet();
        List<String> str = new ArrayList<>();

        for (Map.Entry<String, Integer> setHelpIter : setHelp) {
            try {
                int countChecks = 0;
                for (Map.Entry<String, List<MusicalInstrument>> setHelpCatalogIter : setHelpCatalog) {
                    if (setHelpIter.getKey().equals(setHelpCatalogIter.getKey())) {
                        countChecks++;
                    }
                }
                if (countChecks == 0) {
                    throw new NoSuchProductExcepsion("Извените " + setHelpIter.getKey() + " нет в каталоге магазина");
                }
            } catch (NoSuchProductExcepsion e) {
                System.out.println(e.getMessage());
                str.add(setHelpIter.getKey());
            }
        }
        for (String strHelp:str) {
            order.remove(strHelp);
        }
    }
}
