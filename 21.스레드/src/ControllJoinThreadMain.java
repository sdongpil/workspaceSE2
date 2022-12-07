
public class ControllJoinThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1.main");
		ConcurrentBeepThread bt = new ConcurrentBeepThread();
		ConcurrentPrintThread pt = new ConcurrentPrintThread();

		bt.start();
		/*
		 * bt.join 메소드를 호출한 메인스레드를 bt스레드가 종료될때가지 중지시킨다
		 */
		bt.join();
		System.out.println("2.main");
		pt.start();
		
		pt.join();
		System.out.println("3.main");
		System.out.println("4.main");
		System.out.println("5.main");
		System.out.println("6.main");
		System.out.println("7.main");
		System.out.println("8.main");
		System.out.println("9.main thread end jvm return");

	}

}
