package Pattern;

public class Alphabet_A_to_G {
    public static void alphabet_A() {


    }

    public static void alphabet_B() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || (i == 1 && j < 7) || (i == 7 && j < 7) || (i == 4 && j < 7) || ((i > 1 && i < 4) && j == 7) || ((i > 4 && i < 7) && j == 7)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_C() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (((j == 1 && i != 1) && (i > 1 && i < 7)) || (i == 1 && j != 1) || (i == 7 && j != 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_D() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || (j < 7 && i == 1) || (j < 7 && i == 7) || ((i > 1 && i < 7) && j == 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void alphabet_E() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || i == 7) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_F() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_G() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 1 || i == 7 || (i >= 4 && j == 7) || (i == 4 && j >= 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        alphabet_E();
//        System.out.println();
//        alphabet_F();
//        System.out.println();
        alphabet_G();
//        alphabet_D();
//        alphabet_C();
//        alphabet_B();
    }
}
