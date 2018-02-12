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
public class Task1 {

    public Task1() {
    }

    /**
     * @return array of integer values
     */
    static int[] FillInArray() {
        /* creation & filling array */

        // define the range
        int max = 10;
        int min = -10;
        int range = max - min + 1;

        // fill in array
        int[] RandomNumbers = new int[20];

        System.out.println("initial array:");

        for (int i = 0; i < RandomNumbers.length; i++) {
            int n = (int) (Math.random() * range + min);
            RandomNumbers[i] = n;
            System.out.print(Integer.toString(n) + " ");
        }
        System.out.println();

        return RandomNumbers;

    }

    /**
     * @param RandomNumbers array of integer values
     */
    static void CalcSum(int[] RandomNumbers) {

        /* go through elements in even positions and sum calculation*/
        int sum = 0;

        System.out.println("sum of elements in even positions in the array:");

        for (int i = 1; i < RandomNumbers.length; i = i + 2) {
            sum = sum + RandomNumbers[i];
            if (i < RandomNumbers.length - 1) {
                System.out.print(Integer.toString(RandomNumbers[i]) + " + ");
            } else {
                System.out.print(Integer.toString(RandomNumbers[i]));
            }
        }
        System.out.println(" = " + Integer.toString(sum));
    }

}