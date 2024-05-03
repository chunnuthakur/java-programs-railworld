package String_Questions;

import java.util.Scanner;

public class Maximun_length_of_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        int max = 0;
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
