
public class OuterClass {

	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field = 9999;

	// 메소드
	public void outer_member_method() {
		System.out.println("outerclass method");

	}

	public void outer_inner_class_use() {
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerMemberField = 11;
		ic.inner_outer_member_access();
	}

	// 인스턴스멤버 클래스(nestedclass ,inner class)
	// 작성이유 : 내부클래스에서 외부클래스의 멤버접근을 손쉽게 하기위해
	public class InnerClass {
		public int innerMemberField = 3333;

		public void innerMemberMethod() {
			System.out.println("inner class method");
		}

		/*********** 내부클래스에서 외부클래스의 멤버접근 **********/
		public void inner_outer_member_access() {
			System.out.println(InnerClass.this);
			System.out.println(OuterClass.this);
			outer_member_field = 9999;
			outer_member_method();

		}
	}

}
