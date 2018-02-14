package JavaModule2_Task2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Olga_Liulkovich
 */
public class LinkList extends JavaModule2_Task2.List {

    public void LinkList() {

    }

    /**
     * @return List of Strings
     */

    public static List<String> fillIn() {
        List<String> list = new LinkedList<>();
        int i;
        for (i = 0; i < 7000; i++) {
            list.add("element # " + i);
        }
        //System.out.println(list);

        return list;
    }
}
