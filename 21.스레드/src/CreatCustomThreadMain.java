
public class CreatCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main Thread Start");
		CreatCustomThread cct = new CreatCustomThread();
		cct.setName("사용자정의쓰레드");
		System.out.println("2.main thread start 호출전");
		cct.start();
		System.out.println("3.main thread start 호출후");
		while (true) {
			System.out.println("4.main end");
		}
		
		
		
		
		
	}

}
