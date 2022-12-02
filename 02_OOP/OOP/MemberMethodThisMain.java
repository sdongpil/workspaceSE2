package itwill.OOP;

public class MemberMethodThisMain {
    public static void main(String[] args) {
        MemberMethodThis mmt1 = new MemberMethodThis();
//        mmt1.memberField1 =9999;
//        mmt1.memberField2 = 'A';
//        mmt1.memberField3 = 95.4;

        mmt1.setMemberField(1,'a',3.4);




        System.out.println(mmt1.memberField1+"\t"+ mmt1.memberField2+"\t"+ mmt1.memberField3);

//        mmt1.print();
//        System.out.println("mmt1 주소값: "+mmt1);
        System.out.println();

        MemberMethodThis mmt2 = new MemberMethodThis();
        mmt2.memberField1 =2;
        mmt2.memberField2 = 'F';
        mmt2.memberField3 = 10.4;
        mmt2.setMemberField(1,'b',1.4);
        mmt2.print();




    }
}
