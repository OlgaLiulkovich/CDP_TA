package JavaModule2_Task1;

/**
 * Created by Olga_Liulkovich on 2/7/2018.
 */
public class carnations extends flower {

    private int quantity;
    private String color;

    public carnations(int quantity, String color, double price) {
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
