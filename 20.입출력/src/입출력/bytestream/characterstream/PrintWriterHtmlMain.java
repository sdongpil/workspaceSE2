package 입출력.bytestream.characterstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterHtmlMain {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new FileWriter("hello.html"));
        /*
        <html>
	<head>
		<title>나의HTML</title>
	</head>
	<body>
		<h1>안녕HTML[0]</h1><hr>
	</body>
  </html>
         */
        out.println("<html>");
        out.println("<head>");
        out.println("<title나의HTML</title>");
        out.println("</head>");
        out.println("<body>");
        for (int i = 0; i < 100; i =i+2) {
            out.println("<<h1>안녕HTML["+i+"]</h1><hr>");

        }
        out.println("</body>");
        out.println("</html>");



        out.flush();
        out.close();


    }
}
