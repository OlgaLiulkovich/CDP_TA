package JavaModule2_Task1;

/**
 * @author Olga Liulkovich
 */
public class Rose extends Flower {

    private int length;
    private String color;

    /**
     * @param length defines the length of the rose
     * @param color  define color of the rose
     * @param price  defines base price for the rose
     */
    public Rose(int length, String color, double price) {
        this.name = "rose";
        this.price = price;
        this.length = length;
        this.color = color;
    }

    @Override
    public double GetPrice() {
        return this.price * this.length / 0.5;
    }

    public String GetColor() {
        return color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public int GetLength() {
        return length;
    }

    public void SetLength(int length) {
        this.length = length;
    }
}
