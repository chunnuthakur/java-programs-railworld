package Polymorphism.Method_Overloading;

public class Object_based {
    public void One(String s) {
        System.out.println("String method");
    }

//    public void One(StringBuffer s) {
//        System.out.println("StringBuffer method");
//    }
//
//    public void One(StringBuilder s) {
//        System.out.println("StringBuilder method");
//    }

    public void One(Object s) {
        System.out.println("Object method");
    }

    public static void main(String[] args) {
        Object_based s = new Object_based();
        s.One("Ganesh");
        s.One(null);
    }
}
