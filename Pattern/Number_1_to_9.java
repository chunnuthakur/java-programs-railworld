package Pattern;

public class Number_1_to_9 {
    public static void number_1() {


        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 7 || j == 4 || (i + j == 5 && i <= 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void number_2() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (i == 1 || i == 7 || (i <= 4 && j == 7) || (i > 4 && j == 1) || i==4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_3() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 7 || i == 1 || i == 4 || i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_4() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 5 || j == 5 || (i < 5 && (i + j == 6))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


    public static void number_5() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (i == 1 || i == 7 || (i > 4 && j == 7) || (i <= 4 && j == 1)|| (i==4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_6() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || i == 1 || i == 7 || i == 4 || (i > 4 && j == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_7() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || (i + j == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_8() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 7 || j == 1 || j == 7 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void number_9() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 7 || i == 1 || (i <= 4 && j == 1) || i == 4 || j == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_7();

    }
}
