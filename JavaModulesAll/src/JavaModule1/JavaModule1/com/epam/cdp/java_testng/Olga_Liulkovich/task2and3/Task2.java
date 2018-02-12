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
class Task2 {

    public static int i;

    void Task2() {
    }

    /**
     * @return array of string that were read from System.in
     */
    static String[] ReadValues() {

        // reading values from System.in

        String[] stringArray = new String[1000];
        i = 0;

        System.out.println("Please enter your strings:");

        String line = SystemInReader.ReadSystemIn();
        //while (line != null || !line.equals("") || line.length()>0) {
        while (!line.isEmpty()) {
            stringArray[i] = line;
            i++;
            line = SystemInReader.ReadSystemIn();
        }

        return stringArray;
    }


    /**
     * @param stringArray - array of string values that were read from system.in
     */
    public static void CalculateDiversity(String[] stringArray) {


        // array for storing diversity per string; find min diversity

        double diversityArray[] = new double[10];
        double minDiversity = 1;

        int j;

        for (j = 0; j < i; j++) {
            diversityArray[j] = diversityCalc(stringArray[j]);
            if (minDiversity < diversityArray[j]) {
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


    /**
     * function for calculation of diversity for a given string
     *
     * @param arg string that will be used for diversity calculation
     * @return double value of diversity for a string
     */
    private static double diversityCalc(String arg) {

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