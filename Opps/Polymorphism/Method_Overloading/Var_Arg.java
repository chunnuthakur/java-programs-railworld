package Polymorphism.Method_Overloading;

public class Var_Arg {
    public void One(int... a) {
        System.out.println(a.length);
    }

    public void One(int a) {
        System.out.println(a);
    }


    public static void main(String[] args) {
        Var_Arg obj = new Var_Arg();
        obj.One(12);
        obj.One(12, 34, 56);
    }
}
