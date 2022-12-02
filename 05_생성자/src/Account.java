
public class Account {
    /*
    1.속성 [멤버필드(변수)]
     */
  private   int no;         //계좌번호
    private String ownwer;   // 계좌주이름
    private int balance;    // 계좌잔고
    private double iyul;    // 이율

    public Account(int no, String ownwer, int balance, double iyul) {
        this.no = no;
        this.ownwer = ownwer;
        this.balance = balance;
        this.iyul = iyul;
    }

/*
    2.기능 [멤버메소드]
     */

    public void setAccountData(int no, String ownwer, int balance, double iyul) {
        this.no = no;
        this.ownwer = ownwer;
        this.balance = balance;
        this.iyul = iyul;
    }

    public void print() {
        System.out.printf("%d %s %d %.1f \n", this.no, this.ownwer, this.balance, this.iyul);
    }

    //입금
    void deposit(int money) {
        this.balance += money;
    }

    //출금
    void withDraw(int money) {
        this.balance -= money;
    }
   int getBalance(){
       return balance;
   }

}
