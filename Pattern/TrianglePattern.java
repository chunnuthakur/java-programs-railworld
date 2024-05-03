package Pattern;

public class TrianglePattern {
    public static void halfPyramid() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void leftHalfPyramid() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >=1; j--) {
                if (j <= i) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void invertedHalfPyramid() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leftHalfPyramid();
        halfPyramid();
        invertedHalfPyramid();
    }
}
