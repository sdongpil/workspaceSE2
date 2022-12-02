package itwill.객체간의관계_상속;

public class ParentChildMain {
    public static void main(String[] args) {
        System.out.println("child1");
        Child1 child1 = new Child1();

        child1.member1 = 1;
        child1.member2 = 2;
        child1.member3 = 3;
        child1.member4 = 4;
        child1.method1();
        System.out.println(child1);


        Child2 child2 = new Child2();
        child2.member1 = 1;
        child2.member2 = 2;
        child2.member5 = 5;

        Parent parent = new Parent();
        parent.member1=3;
        parent.member2=4;
        parent.method1();
    }
}
