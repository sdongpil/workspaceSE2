package 입출력.bytestream.characterstream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebServerDataReadMain {
    public static void main(String[] args) throws Exception {
        URL urlStr = new URL("https://cdn.mhns.co.kr/news/photo/202012/423756_556173_237.png")  ;
        InputStream in =  urlStr.openStream();
        FileOutputStream fout = new FileOutputStream("java.jpg");
        while (true) {
            int readByte = in.read();
            if(readByte ==-1)break;
            fout.write(readByte);



            fout.close();
//            System.out.print((char) readByte);
        }
    }
}
