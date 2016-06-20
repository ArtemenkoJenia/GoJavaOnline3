package ua.artemenko.student.goit.company.module_08;

import java.util.Comparator;
import java.util.List;

public class SortCollection {

    public static <T> void insertSortArray(List<T> ob, Comparator<T> comparator) {

        for (int i = 1; i < ob.size(); i++) {
            T newElement = ob.get(i);
            int help = i - 1;
            while (help >= 0 && (comparator.compare(ob.get(help), newElement)) > 0) {
                ob.set(help + 1, ob.get(help));
                help--;
            }
            ob.set(help + 1, newElement);
        }
    }
}
