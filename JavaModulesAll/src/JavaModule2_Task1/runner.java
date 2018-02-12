package JavaModule2_Task1;

import java.util.List;

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

        Bouquet obj = new Bouquet();

        List<IFlower> bo = obj.CreateBouquet();

        obj.CalcPrice(bo);

    }


}
