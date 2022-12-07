
public class ConcurrentBeepPrintMain {

	public static void main(String[] args) {
		System.out.println("1.메인 스레드 스타트");

		System.out.println("2.main thread concurrentbeep 생성");
		ConcurrentBeepThread beepThread = new ConcurrentBeepThread();

		System.out.println("3.start실행");
		beepThread.start();
		
		System.out.println("4.printThread 생성");
		ConcurrentPrintThread printThread = new ConcurrentPrintThread();
		
		System.out.println("5.print start실행");
		printThread.start();

		System.out.println("9.main end  jvm return");
		System.out.println("rㅣㅅ");

	}

}
