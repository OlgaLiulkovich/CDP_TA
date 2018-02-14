package JavaModule2_Task1;

/**
 * Carnations is one of the types of the flowers that can be added to the bouquet
 *
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
     * basic constructor for this type of flower - to add
     *
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
    public double getPrice() {
        return this.price * this.quantity / 5;
    }
}
