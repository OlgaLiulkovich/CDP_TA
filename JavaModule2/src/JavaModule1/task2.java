package JavaModule1;

import java.util.Scanner;

/**
 * Olga Liulkovich
 * Java module 1
 * task #2:
 * Implement a program that processes strings according to the algorithm below and outputs
 the result.
 * Algorithm: Input several strings from the console, output the one that contains minimal
 diversity of characters (example: “aaaaaaaa” contains less diverse characters than
 “abc”)
 */
public class task2 {
    public static void main(String[] args) {

        // reading values from System.in

        String[] stringArray = new String[1000];
        int i = 0;

        System.out.println("Please enter your strings:");

        task2 stringLine = new task2();
        String line = task2.readSystemIn();
        //while (line != null || !line.equals("") || line.length()>0) {
        while (!line.isEmpty()) {
            stringArray[i] = line;
            i++;
            line = task2.readSystemIn();
        }

        // array for storing diversity per string; find min diversity

        double diversityArray[] = new double[10];
        double minDiversity = 1;

        int j;

        for (j = 0; j < i; j++) {
            task2 div = new task2();
            diversityArray[j] = div.diversityCalc(stringArray[j]);
            if (minDiversity>diversityArray[j]){
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

    public static String readSystemIn() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.equals("")) {
            return "";
        }
        else
            return line;

    }

    public double diversityCalc(String arg) {

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