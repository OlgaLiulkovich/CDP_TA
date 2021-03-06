package JavaModule2_Task1;

/**
 * TASK 1
 * Implement object model for defined variation (see variations below). Use the following:
 * -	Classes
 * -	Interfaces
 * -	Inheritance
 * -	Polymorphism
 * -	Encapsulation
 * -	Collections
 * Every class, method and variable should have proper meaning and be named accordingly. Inheritance should only be applied where it makes sense. Classes should be distributed among packages to create a meaningful structure. Packages should be named according to the nature of classes stored in them.
 * The implementation should create objects of respective classes from selected variation and group them into collections as needed.
 * Variation #1:
 * Flower Shop. Implement flowers hierarchy. Create several flower objects. Collect bouquet, calculate its price.
 *
 * @author Olga Liulkovich
 */

public class Runner {

    // main method used for creating & price calc for the bouquet

    public static void main(String[] args) {

        Bouquet b = new Bouquet();

        b.add(new Rose(2, "yellow", 22.2));
        b.add(new Rose(3, "white", 22.2));
        b.add(new Rose(2, "yellow", 22.2));
        b.add(new Chamomile("german", 10));
        b.add(new Carnations(5, "purple", 55));
        b.add(new Carnations(6, "purple", 55));

        double bouquetPrice = 0;
        try {
            bouquetPrice = b.calcPrice();
        } catch (EmptyBouquetException e) {
            e.printStackTrace();
        }

        System.out.println("Total price = " + bouquetPrice);

        // Exception call for JM3 task 1

        Bouquet bException = new Bouquet();

        try {
            double emptyBPrice = bException.calcPrice();
        }
        catch (EmptyBouquetException e)
        {
            System.out.println("Can't calc price for an empty bouquet");
            e.printStackTrace();
        }

    }

}

