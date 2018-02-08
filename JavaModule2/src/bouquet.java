import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga_Liulkovich on 2/7/2018.
 */
public class bouquet {

    public static void main(String[] args) {
        List bouquet = new ArrayList<IFlower>();
        bouquet.add(new rose(2, "yellow", 22.2));
        bouquet.add(new rose(3, "white", 22.2));
        bouquet.add(new rose(2, "yellow", 22.2));
        bouquet.add(new chamomile("german", 10));
        bouquet.add(new carnations(5,"purple", 55));
        bouquet.add(new carnations(6,"purple", 55));

        double bouquetPrice = 0;

        for (int i=0; i<bouquet.size(); i++) {
            IFlower f = (IFlower) bouquet.get(i);
            System.out.println(f.getName() + " " + f.getPrice());
            bouquetPrice+=f.getPrice();
        }

        System.out.println("Total price = " + bouquetPrice);

    }

}
