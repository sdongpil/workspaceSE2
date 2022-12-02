package itwill.OOP;

public class MemberMethod {

    /*  .<< return >>
           - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야한다.
           - 실행흐름을 반환하는 문장이 return문이다.
                   - return 문을 만나면 실행흐름이 호출한곳으로 반환된다.
           - return type이 void 인경우에는 생략이 가능하다.
           - return문이 생략된경우에는 컴파일러가 자동으로 return문을 삽입하여준다.


                   */

    int member1;

    int method1(int a, int b) {
        return a + b;
    }

    void method2() {
        System.out.println("void method2 실행");
        System.out.println("매개변수가 있는 매서드의 호출");
        System.out.println("void method2 종료");
    }

    void method3(int count) {
        System.out.println();
        int localVal = 111;
        for (int i = 0; i < count; i++) {
            member1 += i;
        }
        System.out.println(member1);
    }

    void method4(String msg, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(msg);
        }
    }

    void method5(String name, String msg, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(name + "님" + msg);
        }
    }

}
