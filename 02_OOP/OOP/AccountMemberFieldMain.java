package itwill.OOP;

import sun.java2d.pipe.AAShapePipe;

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
        System.out.printf("%s %s %4s %3s\n","계좌번호","이름","잔고","이율");
        System.out.printf("%5d %4s %d %.1f\n",account1.no,account1.ownwer,account1.balance,account1.iyul);




        /*
        1.은행에 모든계좌에 잔고 50원 증가
         */
        Account a1 = new Account();
        a1.no=133;
        a1.ownwer="kim";
        a1.balance = 70000;
        Account a2 = new Account();
        a2.no=222;
        a2.ownwer="sim";
        a2.balance = 50000;
        Account a3 = new Account();
        a3.no=911;
        a3.ownwer="dim";
        a3.balance = 30000;

        a1.balance +=50;
        a2.balance +=50;
        a3.balance +=50;



        /*
        2.은행계좌 전체정보출력
         */
        System.out.println("2.은행계좌 전체정보출력");
        System.out.printf("%d",a1.balance);
        System.out.printf("%d",a2.balance);
        System.out.printf("%d",a3.balance);
    }
}
