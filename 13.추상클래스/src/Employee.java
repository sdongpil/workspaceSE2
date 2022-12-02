
public abstract class Employee {
    private int no;
    private String name;
    private int pay;

    public Employee(int no, String name) {
        this.no = no;
        this.name = name;

    }

    //자식클래스에서 반드시 재정의해야되는 메소드
    //재정의 강제
    public abstract void calculatePay();
    

    public void print(){
    	System.out.println(this.no + "\t "+this.name+ "\t"+this.pay);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
