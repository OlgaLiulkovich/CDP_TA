package JavaModule2_Task2;

import java.util.Map;

/**
 * base class for working with Maps
 *
 * @author Olga_Liulkovich
 */
public class BaseMap {

    public void Map() {
    }

    /**
     * @param map contains Map of double values with integer as a key
     * @return nanoTime spent for an operation
     */
    public static long Add(Map<Integer, Double> map) {
        long start = System.nanoTime();
        map.put(7000, 1.1);
        return System.nanoTime() - start;
    }

    /**
     * @param map contains Map of double values with integer as a key
     * @return nanoTime spent for an operation
     */
    public static long Find(Map<Integer, Double> map) {
        long start = System.nanoTime();
        map.get(3500);
        return System.nanoTime() - start;
    }

    /**
     * @param map contains Map of double values with integer as a key
     * @return nanoTime spent for an operation
     */
    public static long Remove(Map<Integer, Double> map) {
        long start = System.nanoTime();
        map.remove(3600);
        return System.nanoTime() - start;
    }


}
