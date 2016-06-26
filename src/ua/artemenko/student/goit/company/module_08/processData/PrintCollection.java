package ua.artemenko.student.goit.company.module_08.processData;

import ua.artemenko.student.goit.company.module_08.subsidiary.AuxiliaryInterface;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintCollection {

    public static void printList(List<? extends AuxiliaryInterface> ob){

        for (AuxiliaryInterface help:ob) {
            System.out.println(help);
        }
        System.out.println();
    }

    public static void printMap(Map<String,List<? extends AuxiliaryInterface>> ob){
        Set<Map.Entry<String,List<? extends AuxiliaryInterface>>> helpSet = ob.entrySet();
        for (Map.Entry<String,List<? extends AuxiliaryInterface>> help:helpSet) {
            System.out.println(help.getKey());
            printList(help.getValue());
        }
        System.out.println();
    }
}
