import java.util.Date;

public class ControllSleepThread extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("1초 1번");
				Date now = new Date();
				System.out.println(now);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		
	}

}
