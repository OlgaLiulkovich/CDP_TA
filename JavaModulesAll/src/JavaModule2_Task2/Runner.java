package JavaModule2_Task2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TASK 2
 * Calculate and compare the speed of work (add element, find element, remove element) for the following collections:
 * -	Lists (ArrayList, LinkedList);
 * -	Sets (HashSet, TreeSet);
 * -	Maps (HashMap, TreeMap).
 * Use 7000+ elements in the collections to make measurements visible.
 *
 * @author Olga_Liulkovich
 */
public class Runner {

    public static void main(String[] args) {

        // Array List

        List<String> ArrayListDemo = ArrList.fillIn();

        long AddArrTime;
        long FindArrTime;
        long RemoveArrTime;

        AddArrTime = ArrList.add(ArrayListDemo);

        FindArrTime = ArrList.find(ArrayListDemo);

        RemoveArrTime = ArrList.remove(ArrayListDemo);

        // Linked List

        List<String> LinkedListDemo = LinkList.fillIn();

        long AddLinkTime;
        long FindLinkTime;
        long RemoveLinkTime;

        AddLinkTime = LinkList.add(LinkedListDemo);

        FindLinkTime = LinkList.find(LinkedListDemo);

        RemoveLinkTime = LinkList.remove(LinkedListDemo);

        // printing results for Array & Linked Lists

        System.out.println("Array List vs. Linked List");
        System.out.println("AddTime for Array List:  " + AddArrTime);
        System.out.println("AddTime for Linked List: " + AddLinkTime);
        System.out.println("FindTime for Array List:  " + FindArrTime);
        System.out.println("FindTime for Linked List: " + FindLinkTime);
        System.out.println("RemoveTime for Array List:  " + RemoveArrTime);
        System.out.println("RemoveTime for Linked List: " + RemoveLinkTime);
        System.out.println();

        // HashSet

        Set<Integer> set = HSet.fillIn();

        long AddHSetTime;
        long FindHSetTime;
        long RemoveHSetTime;

        AddHSetTime = HSet.add(set);
        FindHSetTime = HSet.find(set);
        RemoveHSetTime = HSet.remove(set);

        // Tree Set

        Set<Integer> Tset = TSet.fillIn();

        long AddTSetTime;
        long FindTSetTime;
        long RemoveTSetTime;

        AddTSetTime = TSet.add(Tset);
        FindTSetTime = TSet.find(Tset);
        RemoveTSetTime = TSet.remove(Tset);

        // printing results

        System.out.println("Hash Set vs. Tree Set");
        System.out.println("Add time for Hash Set: " + AddHSetTime);
        System.out.println("Add time for Tree Set: " + AddTSetTime);
        System.out.println("Find time for Hash Set: " + FindHSetTime);
        System.out.println("Find time for Tree Set: " + FindTSetTime);
        System.out.println("Remove time for Hash Set: " + RemoveHSetTime);
        System.out.println("Remove time for Tree Set: " + RemoveTSetTime);

        System.out.println();

        // Hash Map

        Map<Integer, Double> Hmap = HMap.fillIn();


        long AddHMapTime;
        long FindHMapTime;
        long RemoveHMapTime;

        AddHMapTime = HMap.add(Hmap);
        FindHMapTime = HMap.find(Hmap);
        RemoveHMapTime = HMap.remove(Hmap);

        // TreeMap

        Map<Integer, Double> Tmap = TMap.fillIn();


        long AddTMapTime;
        long FindTMapTime;
        long RemoveTMapTime;

        AddTMapTime = HMap.add(Tmap);
        FindTMapTime = HMap.find(Tmap);
        RemoveTMapTime = HMap.remove(Tmap);

        // print resutls

        System.out.println("HashMap vs TreeMap");
        System.out.println("Add time for HashMap: " + AddHMapTime);
        System.out.println("Add time for TreeMap: " + AddTMapTime);
        System.out.println("Find time for HashMap: " + FindHMapTime);
        System.out.println("Find time for TreeMap: " + FindTMapTime);
        System.out.println("Remove time for HashMap: " + RemoveHMapTime);
        System.out.println("Remove time for TreeMap: " + RemoveTMapTime);

        System.out.println();

    }

}
