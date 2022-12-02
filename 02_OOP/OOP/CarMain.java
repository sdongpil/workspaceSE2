package itwill.OOP;

public class CarMain {
    public static void main(String[] args) {
        Car car1; //차 객체의 주소값을 저장할 Car타입 참조변수선언
        car1 = new Car();  // Car클래스를 사용해서 차객체를 힙메모리에 생성후 차객체의 주소값이 car1참조변수에 대입

//        car1.no = "1234"; //차객체의 멤버필드 no에 1234값 대입
//        car1.inTime = 12; // 멤버필드 inTime 12대입
//        car1.outTime = 16; //16
//        car1.fee = (car1.outTime - car1.inTime) * 1000;
        System.out.printf("%s,%s,%s,%s\n", "차량번호", "입차시간", "출차시간", "주차요금");
        car1.setEntranceCar("11",3,5);
        System.out.printf("%s,%6d,%6d,%8d", car1.no, car1.inTime, car1.outTime);


    }
}
