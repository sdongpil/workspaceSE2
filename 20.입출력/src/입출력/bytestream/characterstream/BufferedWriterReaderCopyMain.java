package 입출력.bytestream.characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterReaderCopyMain {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌[LINE].txt"));
		int lineNO = 0;

		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			readLine = readLine.replace("제이든", "동필");
			lineNO++;
			bw.write("[" + lineNO + "}" + readLine);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		System.out.println("BufferedWriterReaderCopy" + lineNO);
	}
}
