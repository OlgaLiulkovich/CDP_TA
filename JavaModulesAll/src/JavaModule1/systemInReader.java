package JavaModule1;

import java.util.Scanner;
// AM: use the auto-format of intellij (here and in the other files as well
// AM: class should start with capital letter
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
