package JavaModule1;
// AM: unused imports should be removed
import java.util.Scanner;

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
// AM: Should be Task2 (capital first letter for classes).
// The task is not working properly, it still pick the shortest string instead of the least diverse
class task2 {
    // AM: it's a good practice to add the visibility of the methods, can eliminate some issues
    // Reading the values and other operations should be handled by separate method(s) (like diversityCalc)
    task2 () {

        // reading values from System.in

        String[] stringArray = new String[1000];
        int i = 0;

        System.out.println("Please enter your strings:");

        //task2 stringLine = new task2();
        String line = systemInReader.readSystemIn();
        //while (line != null || !line.equals("") || line.length()>0) {
        while (!line.isEmpty()) {
            stringArray[i] = line;
            i++;
            line = systemInReader.readSystemIn();
        }

        // array for storing diversity per string; find min diversity

        double diversityArray[] = new double[10];
        double minDiversity = 1;

        int j;

        for (j = 0; j < i; j++) {
            diversityArray[j] = this.diversityCalc(stringArray[j]);
            if (minDiversity > diversityArray[j]) {
                minDiversity = diversityArray[j];
            }
        }

        // find the largest divesity in diversityArray

        System.out.println("Result:");

        for (j = 0; j < i; j++) {
            if (diversityArray[j] == minDiversity) {
                System.out.println(stringArray[j]);
            }
        }
    }

    // AM: Javadoc should be added to each method
    private double diversityCalc(String arg) {

        arg = arg.toLowerCase();

        /* diversity is calculated based on the formula:
         sum(n*(n-1))/(N*(N-1))
        */

        int N = arg.length();

        // array for storing n
        double arr[] = new double[N];
        int i = 0;
        String symbol;

        // search for the same chars and count them, found elements to be deleted from initial string
        while (arg.length() > 0) {

            String newString = arg.replaceAll(String.valueOf(arg.charAt(0)), "");
            arr[i] = arg.length() - newString.length();
            i++;
            arg = newString;
        }

        //calculate diversity for a given argument
        i = 0;
        double x = 0;
        for (i = 0; i < arr.length; i++) {
            x += arr[i] * (arr[i] - 1);
        }

        //return final diversity
        return x / (N * (N - 1));
    }

}