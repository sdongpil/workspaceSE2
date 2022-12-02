

public class CarConstructorMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setEntranceCar("1234",12,19);
        car1.calculateFee();
        car1.print();

        System.out.println();

        System.out.println("---------car2-------------");
        Car car2 = new Car("3345",2);
        car2.setOutTime(18);
        car2.calculateFee();
        car2.print();

        System.out.println("오늘 주차장 이용차량 출력");
        Car carA = new Car("1212",1,2,1000);
        Car carB = new Car("2222",1,15,1000);
        Car carC = new Car("333",1,10,1000);

        carA.headerPrint();
        carB.headerPrint();
        carC.headerPrint();

    }
}
