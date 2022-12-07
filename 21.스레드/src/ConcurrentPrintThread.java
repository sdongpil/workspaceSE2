import java.awt.Toolkit;

public class ConcurrentPrintThread extends Thread {
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
