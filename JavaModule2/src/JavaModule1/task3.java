package JavaModule1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Olga Liulkovich
 * Java module 1
 *  task #3:
 * Implement a calculator. The program should take two integer numbers and operation
 character (+, -, * or /) from the console and output the results back to the console.
 */
public class task3 {

    public static void main(String[] args) {

        // read numbers - value 1
        System.out.println("Please enter 2 integer values & operator");
        System.out.print("Value #1:                 ");
        String value1Str = readSystemIn();
        int value1Int;

        System.out.print("Operator (+, -, * or /):  ");
        String operator = readSystemIn();

        System.out.print("Value #2:                 ");
        String value2Str = readSystemIn();
        int value2Int;


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


    public static String readSystemIn() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.equals("")) {
            return "";
        } else
            return line;

    }
}