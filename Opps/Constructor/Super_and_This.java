package Constructor;

public class Super_and_This {

    Super_and_This() {
        this(78);
        System.out.println("First  no arg");
    }

    Super_and_This(int a, int b) {
        System.out.println("Second arg");
    }

    Super_and_This(int a) {
        super();
        System.out.println("Third with one arg");
    }

    public static void main(String[] args) {
        Super_and_This s = new Super_and_This();
    }

}
