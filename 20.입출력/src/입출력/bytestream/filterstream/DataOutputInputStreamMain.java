package 입출력.bytestream.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {
    public static void main(String[] args) throws Exception {
        /*
        자바 기본데이터를 출력스트림에
         */
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataOut.dat"));

        int intdata = 2147483647;
        dos.writeInt(intdata);
        dos.writeByte(127);
        dos.writeBoolean(true);
        dos.writeChar('r');
        dos.writeUTF("자바 ㄱ입출력을 공부합니다");
        dos.close();

        System.out.println("DataOutputStream.write >>> dataOut.dat");

        /*
        자바의 기본테디타를 입력스트림으로 부터 쉽게 읽을수있도록하는 필터스트링클래스

         */
        DataInputStream dis = new DataInputStream(new FileInputStream("dataOut.dat"));
        int a = dis.readInt();
        System.out.println("int: " + a);
        System.out.println("byte: " + dis.readByte());
        System.out.println("char: " + dis.readChar());
        System.out.println("boolean: " + dis.readBoolean());
        dis.close();
    }


}
