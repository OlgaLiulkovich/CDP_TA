package JavaModule2_Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Olga Liulkovich
 */
public class runner {

    //List<IFlower> b = new bouquet().createBouquet();


    bouquet obj = new bouquet();

    List<IFlower> bo = obj.createBouquet();

    obj.createBouquet();

    obj.calcPrice(bo);

    //calcPrice????????



}
