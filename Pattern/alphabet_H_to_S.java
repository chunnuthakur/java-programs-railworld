package Pattern;

public class alphabet_H_to_S {
    public static void alphabet_H() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_I() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 4 || i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void alphabet_J() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 4 || i == 1 || (i == 7 && j < 4) || (i > 4 && j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_K() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1 || (i + j == 6) || (i - j) == 4) {
                    System.out.print("+ ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_L() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (j == 1 || i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_M() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || ((i == j) && i < 4) || (i + j == 8) && i <= 4) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void alphabet_N() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_O() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (((j > 1 && j < 7) && i == 1) || ((j > 1 && j < 7) && i == 7) || ((i > 1 && i < 7) && j == 1) || ((i > 1 && i < 7) && j == 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_P() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || (i == 1 && j < 7) || (i == 4 && j < 7) || (i > 1 && i < 4) && j == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


    public static void alphabet_Q() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {


            }
            System.out.println();
        }
    }

    public static void alphabet_R() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || (j < 7 && i == 1) || (i == 4 && j < 7) || ((i > 1 && i < 4) && j == 7) || (i - j == 3) && i > 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_S() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i <= 4 && j == 1) || i == 1 || i == 7 || i == 4 || (i > 4 && j == 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_T() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if (i == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_U() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if ((i < 7 && j == 1) || (i < 7 && j == 7) || ((j > 1 && j < 7) && i == 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_V() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 14; j++) {

                if (i == j || (i + j == 14)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_W() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || (i == j && i >= 4) || (i + j == 8 && i > 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_X() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || (i + j == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_Y() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                if ((i == j && i <= 4) || (i + j == 8 && i <= 4) || (i > 4 && j == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabet_Z() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 7 || (i + j == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        alphabet_V();
    }
}
