package JavaModule1.com.epam.cdp.java_testng.Olga_Liulkovich.task1;

/**
 * Java module 1
 * task #1:
 * Array contains 20 random integer numbers ranging from -10 to 10 (Math.random() can
 * be used to fill the array). Implement a program that outputs the initial array, processes the
 * data according to the algorithm below and outputs the result.
 * Algorithm:
 * calculate the sum of elements in even positions in the array
 *
 * @author Olga Liulkovich
 */
public class Runner {

    public static void main(String[] args) {

        // filling in array of integer values
        int[] arr = Task1.FillInArray();

        // sum calc for values in even positions
        Task1.CalcSum(arr);

    }
}

