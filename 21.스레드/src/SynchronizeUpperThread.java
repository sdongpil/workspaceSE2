
public class SynchronizeUpperThread extends Thread {
	private SynchronizeUpperLowerPrintSharedObject shareObject;
	
	
	
	public SynchronizeUpperThread(SynchronizeUpperLowerPrintSharedObject shareObject) {
		this.shareObject = shareObject;
	}



	@Override
	public void run() {
			while(true) {
		shareObject.printLower();
			}
	}
}
