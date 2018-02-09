package JavaModule2_Task1;

import JavaModule2_Task1.IFlower;

/**
 *  * @author Olga Liulkovich
 */

public abstract class flower implements IFlower {



    protected String name;
    protected double price;

    public flower() {

    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

}
