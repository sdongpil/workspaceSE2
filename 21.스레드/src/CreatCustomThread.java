
public class CreatCustomThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("가 " + Thread.currentThread().getName() + " 실행");
			System.out.println("나 " + Thread.currentThread().getName() + " 실행후 반환");
		}
	}

}
