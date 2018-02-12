package JavaModule2_Task1;

/**
 * @author Olga Liulkovich
 */
public class Carnations extends Flower {

    /**
     * quantity defines how many buds Carnations have
     * color defines color of the Carnations
     */

    private int quantity;
    private String color;

    /**
     * @param quantity defines how many buds Carnations have
     * @param color    defines color of the Carnations
     * @param price    defines base price of the Carnations
     */

    public Carnations(int quantity, String color, double price) {
        this.name = "carnations";
        this.price = price;
        this.quantity = quantity;
        this.color = color;
    }

    @Override
    public double GetPrice() {
        return this.price * this.quantity / 5;
    }
}
