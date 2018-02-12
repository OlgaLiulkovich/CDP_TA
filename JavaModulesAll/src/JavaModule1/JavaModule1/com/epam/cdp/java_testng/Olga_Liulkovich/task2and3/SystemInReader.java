package JavaModule1.JavaModule1.com.epam.cdp.java_testng.Olga_Liulkovich.task2and3;

import java.util.Scanner;

/**
 * class is used for reading values from System.In
 *
 * @author Olga_Liulkovich
 */
public class SystemInReader {

    public SystemInReader() {

    }

    /**
     * @return string that has been read from System.in.
     */
    public static String ReadSystemIn() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.equals("")) {
            return "";
        } else
            return line;

    }

}
