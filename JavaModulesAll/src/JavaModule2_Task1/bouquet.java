package JavaModule2_Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Olga Liulkovich
 */
public class bouquet {

    public static void main(String[] args) {
        List<IFlower> bouquet = new ArrayList<IFlower>();
        bouquet.add(new rose(2, "yellow", 22.2));
        bouquet.add(new rose(3, "white", 22.2));
        bouquet.add(new rose(2, "yellow", 22.2));
        bouquet.add(new chamomile("german", 10));
        bouquet.add(new carnations(5, "purple", 55));
        bouquet.add(new carnations(6, "purple", 55));

        double bouquetPrice = 0;

        Iterator <IFlower> it = bouquet.iterator();

        while (it.hasNext()) {
            IFlower obj = it.next();

            System.out.println(obj.getName() + " " + obj.getPrice());
            bouquetPrice += obj.getPrice();
        }

        /*
        for (int i = 0; i < bouquet.size(); i++) {
            IFlower f = bouquet.get(i);
            System.out.println(f.getName() + " " + f.getPrice());
            bouquetPrice += f.getPrice();
        }
*/
        System.out.println("Total price = " + bouquetPrice);

    }

}
