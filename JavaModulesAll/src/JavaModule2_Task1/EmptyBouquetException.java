package JavaModule2_Task1;

/**
 * Custom exception class to throw an exception if bouquet is empty
 *
 * @author Olga_Liulkovich
 */
public class EmptyBouquetException extends Exception {

    private int flowerQ;

    public EmptyBouquetException (int flowerQ){
        this.flowerQ = flowerQ;
    }

    public int getFlowerQ(){
        return flowerQ;
    }

}
