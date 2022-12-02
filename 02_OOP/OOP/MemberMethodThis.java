package itwill.OOP;

public class MemberMethodThis {

    //멤버필드 속성
    int memberField1;
    char memberField2;
    double memberField3;


    /*
    1/객체 멤버필드에 데이터를 대입
     */
    void setMemberField(int memberField1, char ch, double d) {
        this.memberField1 = memberField1;
        this.memberField2 = ch;
        this.memberField3 = d;
    }

    //메소드 기능
    //자기자신의 데이터 출력
    void print() {
        /*
        -this= 셀프참조변수
        -void print 를 가지고있는 객체의 주소값
         */

        System.out.println(this.memberField1 + "\t" + memberField2 + "\t" + memberField3);
        System.out.println("this 주소값 :" + this);


    }

}
