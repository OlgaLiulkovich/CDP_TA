package JavaModule2_Task1;

/**
 * Created by Olga_Liulkovich on 2/7/2018.
 */
public class rose extends flower {
    private int length;
    private String color;

    public rose(int length, String color, double price) {
        this.name = "rose";
        this.price = price;
        this.length = length;
        this.color = color;
    }

    @Override
    public double getPrice(){
        return this.price * this.length / 0.5;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
