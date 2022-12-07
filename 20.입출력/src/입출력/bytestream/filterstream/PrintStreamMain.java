package 입출력.bytestream.filterstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) throws Exception {
        PrintStream consolPrintOut = System.out;

        PrintStream filePrintOut =
                new PrintStream(new FileOutputStream("printStream.txt"));
        String s = "프린트스트링";

        filePrintOut.println(s);
        char c = 's';
        Object o = new Object();
        consolPrintOut.println(s);
        consolPrintOut.println(o.toString());
        consolPrintOut.println(c);
        filePrintOut.println(c);
        filePrintOut.println("----------aaa");
        System.out.print(65);
        System.out.println();


    }
}
