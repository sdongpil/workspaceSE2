
public class EmployeePayPrintAbstractMain {
    public static void main(String[] args) {
        Employee[] emps = {
                new SalarlyEmployee(1, "kim", 3000),
                new SalarlyEmployee(2, "gim", 4000),
                new SalarlyEmployee(3, "gim", 2000),
                new HourlyEmployee(4, "hing", 100, 20000),
                new HourlyEmployee(5, "go", 100, 9000)
        };
        for (Employee emp :
                emps) { emp.calculatePay();
            System.out.println("--------"+emp.getName()+"급여 명세표");
            emp.print();
            System.out.println();


        }
    }
}
