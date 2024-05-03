package Polymorphism.Method_Overloading;

public class Constructor {
    int a;
    int b;
    int c;

    Constructor() {
        this(12, 12, 354);
    }

    Constructor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public static void main(String[] args) {
        Constructor s= new Constructor();

        System.out.println();
    }
}
