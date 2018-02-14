package JavaModule2_Task1;

/**
 * Chamomile is one of the types of the flowers that can be added to the bouquet
 *
 * @author Olga Liulkovich
 */
public class Chamomile extends Flower {

    private String type;

    /**
     * @param type  defines type of Chamomile
     * @param price defines base price of Chamomile
     */
    public Chamomile(String type, double price) {
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
