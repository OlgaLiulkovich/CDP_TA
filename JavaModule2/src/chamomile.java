/**
 * Created by Olga_Liulkovich on 2/7/2018.
 */
public class chamomile extends flower {

    private String type;

    public chamomile(String type, double price) {
        this.type = type;
        this.price = price;
        this.name = "chamomile";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
