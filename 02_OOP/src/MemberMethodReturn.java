

public class MemberMethodReturn {
    //멤버필드 선언시 값을 대입할수있다
    int memberField1 = 10;
    int memberField2 = 20;
    int memberField3 = 30;



    int method1() {
        int result = 1 + 2;
        //return <<호출한 클래스(객체)에게 반환할값>>
        //호출한곳으로 데이터반환
        return result;
    }

    boolean method2() {
        boolean isMarried = false;
        return isMarried;
    }

    //두개의 정수를 파라메타로 받아서 더한결과 를 반환하는 메소드
    int add(int a, int b) {
        return a + b;
    }

    String hello(String name) {
        String msg = name + " 안녕하세요";
        return msg;
    }

}
