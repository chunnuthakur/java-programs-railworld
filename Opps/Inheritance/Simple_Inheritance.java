package Inheritance;

class Railword {
   int a=20;
    public void Term_And_Condition() {
        System.out.println("You need to pay 30,000 thousand as deposit amount");
    }
}

public class Simple_Inheritance extends Railword {
//    int a=90;
    public void Term_And_Condition() {
        System.out.println("This is Good for Company future");
    }
    public  void  Parentclass()
    {
        super.Term_And_Condition();
    }

    public void Ganesh() {
        System.out.println("Ganesh this is my name");
    }

    public static void main(String[] args) {
        Simple_Inheritance s1 = new Simple_Inheritance();
        s1.Term_And_Condition();

        Railword s2 = new Simple_Inheritance();
        s2.Term_And_Condition();
        s1.Parentclass();
        System.out.println(s1.a);
        System.out.println(s2.a);


    }
}
