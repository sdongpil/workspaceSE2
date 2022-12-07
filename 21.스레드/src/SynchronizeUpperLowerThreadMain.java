
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) throws Exception {
		SynchronizeUpperLowerPrintSharedObject share = new SynchronizeUpperLowerPrintSharedObject();
		
		SynchronizeLowerThread lower = new SynchronizeLowerThread(share);
		
		SynchronizeUpperThread upper = new SynchronizeUpperThread(share);
		
		lower.start();
		upper.start();
	}

}
