package 입출력.bytestream.filterstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamPrintMethodMain {
    public static void main(String[] args) throws Exception {
        PrintStream pout = new PrintStream(new FileOutputStream("printMethod.txt"));
        pout.write(65);
        pout.write(13);
        pout.write(66);
        pout.write(13);
        pout.print("A");
        pout.print("\n");
        pout.write(66);
        pout.print("\n");
        pout.println("Abc");
        pout.write(65);
        pout.write(66);
        pout.write(67);
        pout.println();
        pout.println(3.1414);
        String s= "3.1441592";
        for (int i = 0; i < s.length(); i++) {
            int tempchar = s.charAt(i);
            pout.write(tempchar);
        }

    }
}
