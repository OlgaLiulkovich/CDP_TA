package JavaModule2_Task2;

import java.util.*;
import java.util.Map;

/**
 * class for operation on Hash Map
 *
 * @author Olga_Liulkovich
 */
public class HMap extends BaseMap {

    public void HMap() {
    }

    /**
     * @return HashMap containing Map of double values with integer as a key
     */
    public static Map<Integer, Double> fillIn() {
        Map<Integer, Double> map = new HashMap<>();

        int i;
        for (i = 0; i < 7000; i++) {
            map.put(i, (Math.random() * 7000 - 3500));
        }

        return map;

    }
}
