package JavaModule2_Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Bouquet class is used to create a bouquet using fixed set of flowers as well as for calculation of the price for this bouquet
 * @author Olga Liulkovich
 */
public class Bouquet {

    private List<IFlower> listFlowers = new ArrayList<IFlower>();

    public void Bouquet() {
//        listFlowers = new ArrayList<IFlower>();
    }

    public void add(IFlower flower){
        listFlowers.add(flower);
    }

    public void delete(int ind){
        listFlowers.remove(ind);
    }

    //create bouquet method

    public List<IFlower> createBouquet() {

        List<IFlower> b = new ArrayList<IFlower>();

        return b;
    }

    /**
     * Price calculation method
     */

    public double calcPrice() {

        /**
         * @param BouquetPrice is used to calculate total price of the bouquet
         */

        double BouquetPrice = 0;

        Iterator <IFlower> it = listFlowers.iterator();

        while (it.hasNext()) {
            IFlower obj = it.next();

            System.out.println(obj.getName() + " " + obj.getPrice());
            BouquetPrice += obj.getPrice();
        }

        return BouquetPrice;

    }

}
