
import java.io.*;

public class BufferedOutputInputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("bufferedOut.dat");

        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write(65);
        bos.write(66);
        bos.write(67);

        for (int i = 0; i <256; i++) {
            bos.write(i);
        }
        bos.close();
        System.out.println("BufferedOutputStream.write >> bufferedOut.dat");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferedOut.dat"));

        int readByte = bis.read();
        System.out.println(Integer.toBinaryString(readByte));
         readByte = bis.read();
        System.out.println(Integer.toBinaryString(readByte));
         readByte = bis.read();
        System.out.println(Integer.toBinaryString(readByte));
        readByte = bis.read();
        System.out.println("4byte:"+Integer.toBinaryString(readByte));

        while (true){
            readByte = bis.read();
            if(readByte == -1)break;
            System.out.println(Integer.toBinaryString(readByte));
        }
        bis.close();
        System.out.println();
        System.out.println("Buffer>>");
    }
}
