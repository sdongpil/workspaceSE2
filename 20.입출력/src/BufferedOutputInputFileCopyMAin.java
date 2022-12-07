
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputInputFileCopyMAin {
    public static void main(String[] args) throws Exception{

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("car1.jpg"));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cc"));
        int count = 0;

        while (true){
            int readByte = bis.read();
            if(readByte == -1)break;
            count++;
            bos.write(readByte);
        }

    }
}
