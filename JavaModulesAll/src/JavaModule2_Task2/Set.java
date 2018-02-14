package JavaModule2_Task2;

/**
 * base class for operation on Sets
 *
 * @author Olga_Liulkovich
 */
public class Set {

    public Set() {

    }

    /**
     * @param set - set of integer values
     * @return nanoTime spent for an operation
     */
    public static long add(java.util.Set<Integer> set) {
        long start = System.nanoTime();
        set.add(1234567);
        return System.nanoTime() - start;
    }

    /**
     * @param set - set of integer values
     * @return nanoTime spent for an operation
     */
    public static long find(java.util.Set<Integer> set) {
        long start = System.nanoTime();
        set.contains(1234567);
        return System.nanoTime() - start;
    }

    /**
     * @param set - set of integer values
     * @return nanoTime spent for an operation
     */
    public static long remove(java.util.Set<Integer> set) {
        long start = System.nanoTime();
        set.remove(5000);
        return System.nanoTime() - start;
    }

}
