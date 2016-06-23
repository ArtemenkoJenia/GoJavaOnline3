package ua.artemenko.student.goit.company.module_08;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintCollection {

    public void printList(List<? extends MyAuxiliaryInterface> ob){

        for (MyAuxiliaryInterface help:ob) {
            System.out.println(help);
        }
        System.out.println();
    }

    public void printMap(Map<String,List<? extends MyAuxiliaryInterface>> ob){
        Set<Map.Entry<String,List<? extends MyAuxiliaryInterface>>> helpSet = ob.entrySet();
        for (Map.Entry<String,List<? extends MyAuxiliaryInterface>> help:helpSet) {
            System.out.println(help.getKey());
            printList(help.getValue());
        }
        System.out.println();
    }
}
