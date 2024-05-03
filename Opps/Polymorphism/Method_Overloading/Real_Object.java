package Polymorphism.Method_Overloading;


class Vivo {

}

class Vivo1  extends  Vivo{

}

public class Real_Object {
    public void One(Vivo a) {
        System.out.println("Vivo-->");
    }

    public void One(Vivo1 a) {
        System.out.println("Vivo1-->");
    }

    public static void main(String[] args) {
        Real_Object s = new Real_Object();
        s.One(new Vivo());
        s.One(new Vivo1());
        s.One(null);

    }
}
