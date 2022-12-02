
public class AccountMemberFieldMain {
    public static void main(String[] args) {
        /********case1*********
         1.1111번호 계좌 8000입금
         */
        /*
        1-1 계좌 객체생성
        1-2 계좌데이터 대입
         */
        Account account1 = new Account();
        account1.no = 1111;
        account1.ownwer = "김철수";
        account1.balance = 10000;
        account1.iyul = 0.3;

        //계좌에 8000추가
        account1.balance += 8000;



        System.out.println("----------------------");
        System.out.printf("%s,%s,%s,%d","계좌번호","이름","잔고","이율");

        System.out.printf("%d,%s,%d,%f",account1.no,account1.ownwer,account1.balance,account1.iyul);


        /*
        2.111 계좌 정보출력
        */


        /*
        1.은행에 모든계좌에 잔고 50원 증가
         */


        /*
        2.은행계좌 전체정보출력
         */
    }
}
