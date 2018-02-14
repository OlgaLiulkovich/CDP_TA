package JavaModule2_Task2;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Olga_Liulkovich
 */
public class TMap extends BaseMap {

    public void TMap() {
    }

    /**
     * @return HashMap containing Map of double values with integer as a key
     */
    public static Map<Integer, Double> fillIn() {
        Map<Integer, Double> map = new TreeMap<>();

        int i;
        for (i = 0; i < 7000; i++) {
            map.put(i, (Math.random() * 7000 - 3500));
        }

        return map;

    }


}

