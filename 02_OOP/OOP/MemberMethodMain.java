package itwill.OOP;

public class MemberMethodMain {
    public static void main(String[] args) {
        System.out.println("main실행");

        MemberMethod m1 = new MemberMethod();

        /* 멤버 메소드 실행(호출)
            -형식: 참조변수,메소드
            -main 실행흐름을 m1주소에 있는 객체의
            method1이라는 이름의 메소드로 보낸다

         */
//
//        System.out.println(m1.method1(7, 9));
//
//        m1.method2();
//
//        m1.method3(10);
//
//        m1.method4("수업끝", 10);
        m1.method5("김경호", "누구세요", 3);

    }
}
