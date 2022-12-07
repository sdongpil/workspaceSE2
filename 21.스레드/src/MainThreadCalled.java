
public class MainThreadCalled {

	public void maing_thread_called_method() {
		System.out.println("a"+Thread.currentThread().getName()+" 쓰레드 실행");
		System.out.println("b"+Thread.currentThread().getName()+" 쓰레드 실행");
	}

}
