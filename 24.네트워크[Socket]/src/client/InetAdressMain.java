package client;

import java.net.InetAddress;

public class InetAdressMain {

	public static void main(String[] args) throws Exception {

		System.out.println("----loca address(IP) --- ");
		InetAddress localAdress = InetAddress.getLocalHost();
		System.out.println("local host name: " + localAdress.getHostName());
		System.out.println("local host IP:" + localAdress.getHostAddress());

		System.out.println("---remote address(IP) ----");
		InetAddress remoteAddress = InetAddress.getByName("www.naver.com");
		System.out.println(remoteAddress.getHostName());
		System.out.println(remoteAddress.getHostAddress());
		
		
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.google.co.kr");
		

	}

}
