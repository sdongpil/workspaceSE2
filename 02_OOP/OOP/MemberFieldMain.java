package itwill.OOP;

public class MemberFieldMain {
    public static void main(String[] args) {
        MemberField mf1;

        /*
         * MemberField 클래스 틀로 객체생성후에 mf에 객체의 값이 대입
         */
        mf1 = new MemberField();


        //mf100주소에 있는 객체의   int타입 member1에 77값을 대입
        //mf객체의 double타입의 멤버변수 2에 3.14값을 대입
        //mf객체의 char타입의 멤버변수 3에 'a'값을 대입
        //mf객체의 String타입의 멤버변수 4에 "ㄱㄴㄷ"값을 대입

        /*
        객체의 참조 주소 변수가 가지고있는 객체의 주소값 100을 사용해서 멤버필드 데이터대입
        객체 멤버필드 접근방법
        -참조변수 .멤버필드이름
         */

        mf1.member1 = 77;
        mf1.member2 = 3.14;
        mf1.member3 = 'a';
        mf1.member4 = "ㄱㄴㄷ";


        //mf객체의 멤버변수 member1값의 출력
        //mf객체의 멤버변수 member2값의 출력
        //mf객체의 멤버변수 member3값의 출력
        System.out.println(mf1.member1);
        System.out.println(mf1.member2);
        System.out.println(mf1.member3);

        MemberField mf2 = new MemberField();
        mf2.member1 =88;
        mf2.member2 = 3.14;
        mf2.member3 = 'r';
        mf2.member4 = "abc";
        System.out.println(mf2.member1);
        System.out.println(mf2.member2);
        System.out.println(mf2.member3);



        System.out.println("---maing end---");
    }
}
