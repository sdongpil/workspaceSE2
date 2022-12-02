

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();

        /*
        new Constructor();
        1.Constructor 클래스로 객체생성
        2.생성자메소드 블록 호출
        3.생성된 객체의 주소반환

                */

        constructor.print();

        Constructor constructor2 = new Constructor(3,4);
        constructor2.print();


    }
}
