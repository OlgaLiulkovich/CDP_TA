/**
 * Created by Olga_Liulkovich on 2/7/2018.
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
