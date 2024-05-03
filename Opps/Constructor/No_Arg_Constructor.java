package Constructor;

class A {

}
class B extends A{

}
public class No_Arg_Constructor extends B {
    No_Arg_Constructor() {
        super();
    }

    public static void main(String[] args) {
        No_Arg_Constructor s = new No_Arg_Constructor();
        if (s instanceof B) {
            System.out.println("Yes"
            );
        }
    }
}
