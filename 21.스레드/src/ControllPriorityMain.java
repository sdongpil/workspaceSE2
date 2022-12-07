
public class ControllPriorityMain {
	public static void main(String[] args) {
		ConcurrentBeepThread bt = new ConcurrentBeepThread();
		ConcurrentPrintThread pt = new ConcurrentPrintThread();
		System.out.println(bt.getPriority());
		System.out.println(pt.getPriority());
		
		bt.setPriority(10);
		pt.setPriority(10);
		
		bt.start();
		pt.start();
		
	}

}
