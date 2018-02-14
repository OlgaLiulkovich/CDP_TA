package JavaModule2_Task2;

import java.util.List;
import java.util.ArrayList;

/**
 * Array List implementation
 *
 * @author Olga_Liulkovich
 */
public class ArrList extends JavaModule2_Task2.List {

    public void ArrList() {
    }

    /**
     * @return List of Strings
     */

    public static List<String> fillIn() {

        List<String> list = new ArrayList();

        int i;
        for (i = 0; i < 7000; i++) {
            list.add("element # " + i);
        }
        //System.out.println(list);

        return list;
    }

}
