package ua.artemenko.student.goit.company.module_11.module_09.processData;

import ua.artemenko.student.goit.company.module_11.module_09.subsidiary.AbstractAuxiliary;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintCollection {

    public static void printList(List<? extends AbstractAuxiliary> ob){

        for (AbstractAuxiliary help:ob) {
            System.out.println(help);
        }
        System.out.println();
    }

    public static void printMap(Map<String,List<? extends AbstractAuxiliary>> ob){
        Set<Map.Entry<String,List<? extends AbstractAuxiliary>>> helpSet = ob.entrySet();
        for (Map.Entry<String,List<? extends AbstractAuxiliary>> help:helpSet) {
            System.out.println(help.getKey());
            printList(help.getValue());
        }
        System.out.println();
    }
}
