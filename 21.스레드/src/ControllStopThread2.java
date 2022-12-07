
public class ControllStopThread2 extends Thread {
	private boolean isPlay;

	public ControllStopThread2() {
		this.isPlay = true;
	}
	

	public boolean isPlay() {
		return isPlay;
	}


	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}


	@Override
	public void run() {
		while (isPlay) {
			try {
				System.out.println("-------");
				System.out.println("1.game move");
				Thread.sleep((int) (Math.random() * 1000 + 1));
				System.out.println("2.game fight");
				Thread.sleep((int) (Math.random() * 1000 + 1));
				System.out.println("3.game power up");
				Thread.sleep((int) (Math.random() * 1000 + 1));
				System.out.println("4.game score update");

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
