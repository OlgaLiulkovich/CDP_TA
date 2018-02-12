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

        List<String> ArrayListDemo = ArrList.FillIn();

        long AddArrTime;
        long FindArrTime;
        long RemoveArrTime;

        AddArrTime = ArrList.Add(ArrayListDemo);

        FindArrTime = ArrList.Find(ArrayListDemo);

        RemoveArrTime = ArrList.Remove(ArrayListDemo);

        // Linked List

        List<String> LinkedListDemo = LinkList.FillIn();

        long AddLinkTime;
        long FindLinkTime;
        long RemoveLinkTime;

        AddLinkTime = LinkList.Add(LinkedListDemo);

        FindLinkTime = LinkList.Find(LinkedListDemo);

        RemoveLinkTime = LinkList.Remove(LinkedListDemo);

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

        Set<Integer> set = HSet.FillIn();

        long AddHSetTime;
        long FindHSetTime;
        long RemoveHSetTime;

        AddHSetTime = HSet.Add(set);
        FindHSetTime = HSet.Find(set);
        RemoveHSetTime = HSet.Remove(set);

        // Tree Set

        Set<Integer> Tset = TSet.FillIn();

        long AddTSetTime;
        long FindTSetTime;
        long RemoveTSetTime;

        AddTSetTime = TSet.Add(Tset);
        FindTSetTime = TSet.Find(Tset);
        RemoveTSetTime = TSet.Remove(Tset);

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

        Map<Integer, Double> Hmap = HMap.FillIn();


        long AddHMapTime;
        long FindHMapTime;
        long RemoveHMapTime;

        AddHMapTime = HMap.Add(Hmap);
        FindHMapTime = HMap.Find(Hmap);
        RemoveHMapTime = HMap.Remove(Hmap);

        // TreeMap

        Map<Integer, Double> Tmap = TMap.FillIn();


        long AddTMapTime;
        long FindTMapTime;
        long RemoveTMapTime;

        AddTMapTime = HMap.Add(Tmap);
        FindTMapTime = HMap.Find(Tmap);
        RemoveTMapTime = HMap.Remove(Tmap);

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
