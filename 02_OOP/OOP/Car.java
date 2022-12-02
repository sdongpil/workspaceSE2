package itwill.OOP;

/*
    1.주차장에서 차객체를 생성할 클래스
    2.Car 객체의 주소를 저장할 참조변수
 */
public class Car {
    String no;      //차량번호
    int inTime;     //입차시간
    int outTime;    //출차시간
    int fee;        //주차요금


    void setEntranceCar(String s, int inTime, int outTime) {
        this.no = s;
        this.inTime = inTime;
        this.outTime = outTime;
        System.out.printf("%s %d %d \n", this.no, this.inTime, outTime);
    }

    void calculateFee() {
        this.fee = ((this.outTime - this.inTime) * 1000);
        System.out.printf("%d  ", this.fee);
    }

}
