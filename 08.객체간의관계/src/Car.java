

public class Car {
    public Car() {
    }

    public int no;

    public String model;

    public Engine engine; // 차량엔진객체의 주소를 저장할 멤버필드



    public void print(){
        System.out.println(this.no+"\t"+ this.model);
        engine.print();
    }

    public Car(int no, String model, Engine engine) {
        this.no = no;
        this.model = model;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
