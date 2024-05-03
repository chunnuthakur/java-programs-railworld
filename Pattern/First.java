package Pattern;


public class First {

    public static void numberTriangle() {
        System.out.println("NumberTriangle");

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle1() {
        System.out.println("Number Triangle");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle2() {
        System.out.println("NumberTriangle");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle3() {
        System.out.println("NumberTriangle");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle4() {
        System.out.println("NumberTriangle");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberTriangle();
        System.out.println();
        numberTriangle1();
        System.out.println();
        numberTriangle2();
        System.out.println();
        numberTriangle3();
        System.out.println();
        numberTriangle4();
    }
}
