package JavaModule1;

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
public class task1 {


    public task1() {
        /* creation & filling array */

        // define the range
        int max = 10;
        int min = -10;
        int range = max - min + 1;

        // fill in array
        int[] randomNumbers = new int[20];

        System.out.println("initial array:");

        for (int i = 0; i < randomNumbers.length; i++) {
            int n = (int) (Math.random() * range + min);
            randomNumbers[i] = n;
            System.out.print(Integer.toString(n) + " ");
        }
        System.out.println();

        /* go through elements in even positions and sum calculation*/
        int sum = 0;

        System.out.println("sum of elements in even positions in the array:");

        for (int i = 1; i < randomNumbers.length; i = i + 2) {
            sum = sum + randomNumbers[i];
            if (i < randomNumbers.length - 1) {
                System.out.print(Integer.toString(randomNumbers[i]) + " + ");
            } else {
                System.out.print(Integer.toString(randomNumbers[i]));
            }
        }
        System.out.println(" = " + Integer.toString(sum));
    }
}
