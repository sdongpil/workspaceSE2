
import java.io.FileOutputStream;
/*
 * <<출력스트림(OutputStream)사용방법>>
 * 1. 데이타 목적지(target,destination) 선정(파일)
 * 2. 출력스트림(OutputStream)객체생성(FileOutputStream)
 * 3. 출력스트림(OutputStream)에 한바이트씩 쓴다(write)
 * 4. 출력스트림(OutputStream)닫는다.(close) 
 */
public class FileOutputStreamMain {

	public static void main(String[] args)throws Exception {
		
		FileOutputStream fos=new FileOutputStream("fileOut.dat");
		
		fos.write(65);
		fos.write(66);
		fos.write(0b00000000000000000000000001000011);
		
		fos.close();
		System.out.println("FileOutputStream.write()-->fileOut.dat");


	}
}