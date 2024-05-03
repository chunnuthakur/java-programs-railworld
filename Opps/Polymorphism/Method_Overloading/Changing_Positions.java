package Polymorphism.Method_Overloading;

public class Changing_Positions {
    public void add(int a, int b) {
        System.out.println(a + " " + b);
    }

    // method overloadinng concept based on the data type not on the variable type

//    public void add(int b, int a) {
//        System.out.println(b + " " + a);
//    }

//    public void add(float a, int b) {
//        System.out.println(a + " " + b);
//    }
//
//    public void add(int a, float b) {
//        System.out.println(a + " " + b);
//    }

    public static void main(String[] args) {
        Changing_Positions s = new Changing_Positions();
        s.add(12, 45);
    }
}
