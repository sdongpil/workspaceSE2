package president.korea;

import president.america.Trump;

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	public void access() {
		/**************YS�� ������Ű���� Ŭ���� ����*****************/
		DJ dj=new DJ();
		dj.member1=1;
		dj.member2=2;
		dj.member3=3;
		//dj.member4=4;
		dj.method1();
		dj.method2();
		dj.method3();
		//dj.method4();
		/**************YS�� �ٸ���Ű���� Ŭ���� ����*****************/
		Trump trump=new Trump();
		trump.member1=1;
		/*
		trump.member2=2;
		trump.member3=3;
		trump.member4=4;
		*/
		trump.method1();
		/*
		trump.method2();
		trump.method3();
		trump.method4();
		*/
	}
	
}
















