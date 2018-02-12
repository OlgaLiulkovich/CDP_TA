package JavaModule1.JavaModule1.com.epam.cdp.java_testng.Olga_Liulkovich.task2and3;

/**
 * Java module 1
 * task #3:
 * Implement a calculator. The program should take two integer numbers and operation
 * character (+, -, * or /) from the console and output the results back to the console.
 *
 * @author Olga Liulkovich
 */
class Task3 {

    public static int value1Int;
    public static String operator;
    public static int value2Int;
    public static String value1Str;
    public static String value2Str;


    Task3() {
    }


    /**
     * method ReadValues() reads parameters and operator from System.in
     */
    static void ReadValues() {

        // read numbers - value 1
        System.out.println("Please enter 2 integer values & operator");
        System.out.print("Value #1:                 ");
        value1Str = SystemInReader.ReadSystemIn();

        System.out.print("Operator (+, -, * or /):  ");
        operator = SystemInReader.ReadSystemIn();

        System.out.print("Value #2:                 ");
        value2Str = SystemInReader.ReadSystemIn();

    }

    /**
     * method Calculate performs validation of entered values and calculations
     */
    public static void Calculate() {
        try {
            value1Int = Integer.parseInt(value1Str);
            value2Int = Integer.parseInt(value2Str);

            double x;

            switch (operator) {
                case "+":
                    System.out.println("Result:                   " + (value1Int + value2Int));
                    break;
                case "-":
                    System.out.println("Result:                   " + (value1Int - value2Int));
                    break;
                case "*":
                    System.out.println("Result:                   " + (value1Int * value2Int));
                    break;
                case "/":
                    if (value2Int != 0) {
                        System.out.println("Result:                   " + (value1Int / value2Int));
                        break;
                    } else {
                        System.out.println("Can't divide by 0, exiting...");
                        break;
                    }
                default:
                    System.out.println("Incorrect operator entered, exiting...");
                    break;
            }

        } catch (NumberFormatException ex) {
            System.out.println("At least one input is not a valid integer, exiting ...");
        }

    }

}

