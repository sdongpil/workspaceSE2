import java.util.Iterator;

public class ControllStopThread1 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("download"+i+"%");
				Thread.sleep(50);
				
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("stopThread1 >> jvm return ");
			
	
	}

}
