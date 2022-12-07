
public class SynchronizeLowerThread extends Thread {
	private SynchronizeUpperLowerPrintSharedObject shareObject;
	


	public SynchronizeLowerThread(SynchronizeUpperLowerPrintSharedObject shareObject) {
		this.shareObject = shareObject;
	}



	@Override
	public void run() {
		while(true) {
		shareObject.printUpper();
		}
	}
}
