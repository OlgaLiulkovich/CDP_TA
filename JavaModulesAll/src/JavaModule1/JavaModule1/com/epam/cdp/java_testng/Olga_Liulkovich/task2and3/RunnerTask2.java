package JavaModule1.JavaModule1.com.epam.cdp.java_testng.Olga_Liulkovich.task2and3;

/**
 * Java module 1
 * task #2:
 * Implement a program that processes strings according to the algorithm below and outputs
 * the result.
 * Algorithm: Input several strings from the console, output the one that contains minimal
 * diversity of characters (example: “aaaaaaaa” contains less diverse characters than
 * “abc”)
 *
 * @author Olga Liulkovich
 */

public class RunnerTask2 {

    public static void main(String[] args) {

        //task2 task = new task2();
        // read strings from System.in into array
        String[] arr = Task2.ReadValues();

        //Calculate diversity and define string with less diversity
        Task2.CalculateDiversity(arr);

    }
}
