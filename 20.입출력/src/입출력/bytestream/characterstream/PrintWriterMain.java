package 입출력.bytestream.characterstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterMain {
    public static void main(String[] args)throws Exception {
        PrintWriter pw = new PrintWriter(new FileWriter("printWriter.txt"));
        pw.write("sssss");
        pw.println();
        pw.write(65);
        pw.print(65);
        pw.println();
        pw.write(4654);
        boolean t = true;
        pw.println(t);
        String boo = t+"";
        for (int i = 0; i < boo.length(); i++) {
            pw.write(boo.charAt(i));
        }

        pw.println("---------");
        pw.println("html");
        pw.println("/head");
        pw.println("body");
        pw.println("body");
        for (int i = 0; i < 5; i++) {
            pw.println("h1");
            pw.println("안녕! html" +i);
            pw.println("/h1");
        }
        pw.println("/html");



        pw.flush();
    }
}
