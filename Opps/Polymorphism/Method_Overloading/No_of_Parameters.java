package Polymorphism.Method_Overloading;

public class No_of_Parameters {
    public void add() {
        System.out.println("zero");
    }

    public void add(int a) {
        System.out.println("one");
    }

    public void add(int a, int b) {
        System.out.println("two");
    }

    public static void main(String[] args) {
        No_of_Parameters s = new No_of_Parameters();
        s.add();
        s.add(34);
        s.add(34, 56);
    }
}
