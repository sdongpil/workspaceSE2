
public class ControllStopThreadMain {

	public static void main(String[] args) throws Exception {
//		ControllStopThread1 cst = new ControllStopThread1();
//		cst.start();
//		Thread.sleep(1000);
//		cst.stop();

		ControllStopThread2 cst2 = new ControllStopThread2();
		cst2.start();
		Thread.sleep(5000);
		cst2.setPlay(false);
		Thread.sleep(10000);


		System.out.println("main ret urn");
	}

}
