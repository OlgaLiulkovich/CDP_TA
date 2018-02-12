package JavaModule2_Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Bouquet class is used to create a bouquet using fixed set of flowers as well as for calculation of the price for this bouquet
 * @author Olga Liulkovich
 */
public class Bouquet {

    public void Bouquet() {
    }

    //create bouquet method

    public List<IFlower> CreateBouquet() {

        List<IFlower> b = new ArrayList<IFlower>();
        b.add(new Rose(2, "yellow", 22.2));
        b.add(new Rose(3, "white", 22.2));
        b.add(new Rose(2, "yellow", 22.2));
        b.add(new Chamomile("german", 10));
        b.add(new Carnations(5, "purple", 55));
        b.add(new Carnations(6, "purple", 55));

        return b;
    }

    /**
     * Price calculation method
     * @param Bouquet is a created bouquet
     */

    public void CalcPrice (List<IFlower> Bouquet) {

        /**
         * @param BouquetPrice is used to calculate total price of the bouquet
         */

        double BouquetPrice = 0;

        Iterator <IFlower> it = Bouquet.iterator();

        while (it.hasNext()) {
            IFlower obj = it.next();

            System.out.println(obj.GetName() + " " + obj.GetPrice());
            BouquetPrice += obj.GetPrice();
        }
        System.out.println("Total price = " + BouquetPrice);

    }

}
