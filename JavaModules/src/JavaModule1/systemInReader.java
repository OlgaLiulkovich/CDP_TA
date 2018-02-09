package JavaModule1;

import java.util.Scanner;

/**
@author Olga_Liulkovich  */
public class systemInReader {

    public systemInReader() {

    }

    public static String readSystemIn(){

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.equals("")) {
            return "";
        } else
            return line;

    }

}
