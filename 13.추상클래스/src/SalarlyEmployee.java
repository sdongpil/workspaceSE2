
public class SalarlyEmployee extends Employee {

    private int annualSalary;

    public SalarlyEmployee(int no, String name, int annualSalary) {
        super(no, name);
        this.annualSalary = annualSalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(annualSalary);
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public void calculatePay() {
        int tempPay = this.annualSalary/12;
        this.setPay(tempPay);
    }
}
