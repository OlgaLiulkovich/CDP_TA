package JavaModule2_Task2;

/**
 * Based class for Array & Linked Lists
 *
 * @author Olga_Liulkovich
 */
public class List {

    public void List() {
    }

    /**
     * @param list of string values
     * @return nanoTime spent for an operation
     */
    public static long add(java.util.List<String> list) {
        long start = System.nanoTime();
        list.add("newly added element");
        return System.nanoTime() - start;
    }

    /**
     * @param list of string values
     * @return nanoTime spent for an operation
     */

    public static long find(java.util.List<String> list) {
        long start = System.nanoTime();
        list.contains("element # 4000");
        return System.nanoTime() - start;
    }

    /**
     * @param list of string values
     * @return nanoTime spent for an operation
     */
    public static long remove(java.util.List<String> list) {
        long start = System.nanoTime();
        list.remove(5000);
        return System.nanoTime() - start;
    }


}
