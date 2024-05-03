package String_Questions;

import java.util.Scanner;

public class First_Character_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].charAt(0);
        }
        System.out.println(sum);
    }
}
