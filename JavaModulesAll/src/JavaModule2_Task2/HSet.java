package JavaModule2_Task2;

import java.util.HashSet;
import java.util.Set;

/**
 * Hash Set
 *
 * @author Olga_Liulkovich
 */
public class HSet extends JavaModule2_Task2.Set {

    public void HSet() {

    }

    /**
     * filling in Hash Set
     *
     * @return filled in Set of integer values which will be used for downstream operations
     */
    public static Set<Integer> FillIn() {
        Set<Integer> set = new HashSet<>();

        int i;

        for (i = 0; i < 7000; i++) {
            set.add((int) (Math.random() * 7000 - 3500));
        }

        return set;
    }
}
