package JavaModule2_Task1;

import JavaModule2_Task1.IFlower;

/**
 * Base class Flower
 * author Olga Liulkovich
 */

public abstract class Flower implements IFlower {

    protected String name;
    protected double price;

    public Flower() {

    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

}
