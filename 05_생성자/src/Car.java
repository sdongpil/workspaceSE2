

/*
    1.주차장에서 차객체를 생성할 클래스
    2.Car 객체의 주소를 저장할 참조변수
 */
public class Car {

    private String no;      //차량번호
    private int inTime;     //입차시간
    private int outTime;    //출차시간
    private int fee;        //주차요금

    public Car() {

    }

    //차량번호, 입차시간을 받아서
    //멤버필드의 값을 가진 차 객체생성
    public Car(String no, int inTime) {
        this.no = no;
        this.inTime = inTime;
    }

    /*
    차량의 멤버데이터를 인자로 받아서
    멤버필드의 값을 가진 차 객체생성
     */
    public Car(String no, int inTime, int outTime,int fee) {
        this.no = no;
        this.inTime = inTime;
        this.outTime = outTime;
        this.fee=fee;

    }


    public void setEntranceCar(String s, int inTime, int outTime) {
        this.no = s;
        this.inTime = inTime;
        this.outTime = outTime;
        System.out.printf("%s %d %d \n", this.no, this.inTime, this.outTime);
    }

    public void setOutTime(int outTime) {
        this.outTime = outTime;
    }

    public void calculateFee() {
        this.fee = ((this.outTime - this.inTime) * 1000);
    }

    void print() {
        System.out.printf("%d  \n", this.fee);
    }
    void headerPrint(){
        System.out.println();
        System.out.printf("%s %s %s \n","차량번호","입차","출차") ;
        System.out.printf("%s %d %d \n", this.no, this.inTime, this.outTime);
    }
}
