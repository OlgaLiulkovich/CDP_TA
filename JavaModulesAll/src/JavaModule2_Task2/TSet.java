package JavaModule2_Task2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Tree Set
 *
 * @author Olga_Liulkovich
 */
public class TSet extends JavaModule2_Task2.Set {

    public void TSet() {

    }

    /**
     * @return filled in Set of integer values which will be used for downstream operations
     */
    public static Set<Integer> FillIn() {
        Set<Integer> set = new TreeSet<>();
        int i;
        for (i = 0; i < 7000; i++) {
            set.add((int) (Math.random() * 7000 - 3500));
        }
        return set;
    }

}
