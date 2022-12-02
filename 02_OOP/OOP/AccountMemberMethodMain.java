package itwill.OOP;

public class AccountMemberMethodMain {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account2.setAccountData(112,"손",8000,3);
        account3.setAccountData(113,"ka",5000,3.4);
        account1.setAccountData(110, "김철수", 70000, 3.3);

        account1.deposit(50);
        account2.deposit(50);
        account3.deposit(50);

        account1.print();
        account2.print();
        account3.print();


    }
}
