package Abstraction.Abstract_Class;

public abstract class Abstract_one {
    int a;
    int b;

    Abstract_one(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void display();

}

class Second extends Abstract_one {
    int c;
    int d;

    Second(int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    @Override
    public void display() {
        System.out.println(this.a + " " + b + " " + c + " " + d);
    }

    @Override
    public String toString() {
        return "Second{" +
                "c=" + c +
                ", d=" + d +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Second s= new Second(12,13,14,15);
        s.display();
        System.out.println(s);
    }
}
