package JavaModule2_Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Bouquet class is used to create a bouquet using fixed set of flowers as well as for calculation of the price for this bouquet
 *
 * @author Olga Liulkovich
 */
public class Bouquet {

    private List<IFlower> listFlowers = new ArrayList<IFlower>();

    public void Bouquet() {
        //listFlowers = new ArrayList<IFlower>(); - why this one is not working???
    }


    // add exception here like 4 the same flowers
    public void add(IFlower flower) {
        listFlowers.add(flower);
    }


    public void delete(int ind) {
        listFlowers.remove(ind);
    }

    /**
     * Price calculation method
     */

    // exception for empty bouquet
    public double calcPrice() {

        double BouquetPrice = 0;

        Iterator<IFlower> it = listFlowers.iterator();

        while (it.hasNext()) {
            IFlower obj = it.next();

            System.out.println(obj.getName() + " " + obj.getPrice());
            BouquetPrice += obj.getPrice();
        }

        return BouquetPrice;

    }

}
