package ua.artemenko.student.goit.company.module_08;


import ua.artemenko.student.goit.company.module_03.interfacePac.AuxiliaryInterface;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintCollection {

    public void printList(List<AuxiliaryInterface> ob){
        for (AuxiliaryInterface help:ob) {
            System.out.println(help.toString());
        }
        System.out.println();
    }

    public void printMap(Map<String,List<AuxiliaryInterface>> ob){
        Set<Map.Entry<String,List<AuxiliaryInterface>>> helpSet = ob.entrySet();
        for (Map.Entry<String,List<AuxiliaryInterface>> help:helpSet) {
            System.out.println(help.getKey());
            printList(help.getValue());
        }
        System.out.println();
    }
}
