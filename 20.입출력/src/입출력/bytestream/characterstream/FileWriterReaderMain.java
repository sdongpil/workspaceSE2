package 입출력.bytestream.characterstream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderMain {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("fileWriter.txt");

        fileWriter.write(44356);
        fileWriter.write('a');
        fileWriter.write('김');

        for (int i = 0; i < 65536; i++) {
            fileWriter.write(i);
            if (i % 100 == 0) {
                fileWriter.write('\n');
            }
        }
        fileWriter.write('\n');
        fileWriter.write("문자열을 맘대로 사용");
        fileWriter.write('\n');
        fileWriter.write("한라인");
        fileWriter.write("\n");
        fileWriter.write("두라인\n");
        fileWriter.write("세라인\n");

        fileWriter.flush();
        fileWriter.close();
        System.out.println("file.writer >>>> filewriter.txt");
        FileReader fr = new FileReader("fileWriter.txt");

        int readChar = fr.read();
        System.out.println("1" + (char) readChar);
        readChar = fr.read();
        System.out.println("1" + (char) readChar);
        readChar = fr.read();
        System.out.println("1" + (char) readChar);
        int count =0;
        while (true) {
            readChar = fr.read();
            if (readChar == -1) break;
            if(readChar == '인'){
                count++;
            }
            System.out.println(readChar);
        }
        fr.close();
        System.out.println("카운트: "+count);
    }
}
