package JavaModule3_Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * JM 3
 * TASK 2
 * Using input/output streams implement a program that reads a collection of strings from an input text
 * file, sorts them by their length and writes to an output text file.
 *
 * @author Olga_Liulkovich
 */
public class Runner {

    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outStream = null;
        ArrayList<String> strArr = new ArrayList<String>();

        //reading lines from in.txt
        try {
            inputStream = new BufferedReader(new FileReader("src/JavaModule3_Task2/in.txt"));
            String l;
            while (((l = inputStream.readLine()) != null)) {
                strArr.add(l);
            }
            System.out.println(strArr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        // sort Array
        Collections.sort(strArr, strLength);

        // write result into out.txt
        try {
            outStream = new PrintWriter(new FileWriter("src/JavaModule3_Task2/out.txt"));
            for (String l : strArr) {
                outStream.println(l);
            }
            System.out.println(strArr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    static final Comparator<String> strLength = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

}
