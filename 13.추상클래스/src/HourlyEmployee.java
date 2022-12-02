
public class HourlyEmployee extends Employee {

    private int worksHour;
    private int payPerHour;

    public HourlyEmployee(int no, String name) {
        super(no, name);
    }

    public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
        super(no, name);
        this.worksHour = worksHour;
        this.payPerHour = payPerHour;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(worksHour + "\t" + payPerHour);
    }

    @Override
    public void calculatePay() {
        this.setPay(this.worksHour*this.payPerHour);
    }

    public int getWorksHour() {
        return worksHour;
    }

    public void setWorksHour(int worksHour) {
        this.worksHour = worksHour;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }
}
