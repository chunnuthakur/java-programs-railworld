package Polymorphism.Method_Overriding;

public class First {
    public void m1() {
        System.out.println("first ");
    }

    public void m1(int a) {
        System.out.println(a);
    }


}

class Second extends First {
    public void m1() {
        System.out.println("second ");
    }

    public void m1(int a) {
        System.out.println(a);
    }


    public static void main(String[] args) {
        First s1 = new First();
        s1.m1();
        s1.m1(1);

        Second s2 = new Second();
        s2.m1();
        s2.m1(2);

        First s3 = new Second();
        s3.m1();
        s3.m1(3);
    }
}