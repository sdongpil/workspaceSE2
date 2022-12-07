package 입출력.bytestream.characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterReaderMain {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriter.txt"));
        bw.write("첫번째줄");
        bw.newLine();
        bw.write("2번째줄");
        bw.newLine();
        bw.write("3번째줄");
        bw.newLine();
        bw.write("4번째줄");
        bw.newLine();
        bw.write("5번째줄");
        bw.newLine();

        bw.flush();
        bw.close();

        System.out.println(" BufferedWriter>>bufferedWriter.txt");

        BufferedReader br = new BufferedReader(new FileReader("bufferedWriter.txt"));

        String readLine = br.readLine();
        System.out.println("1.readline =" +readLine);
        readLine = br.readLine();
        System.out.println("2.readline =" +readLine);

        while (true){
            readLine = br.readLine();
            if(readLine ==null)break;
            System.out.println(readLine);
        }
        br.close();
    }
}
