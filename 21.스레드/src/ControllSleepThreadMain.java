
public class ControllSleepThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		System.out.println("2. 3초 정지");
		Thread.sleep(3000);
		System.out.println("깨어남");
		ControllSleepThread c = new ControllSleepThread();
		c.start();

		System.out.println("2.main return");
	}

}
