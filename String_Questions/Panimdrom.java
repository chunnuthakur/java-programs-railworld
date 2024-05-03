package String_Questions;

import java.util.Scanner;

public class Panimdrom {
    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String ans = "";

        for (int i = 0; i < arr.length; i++) {
            if (checkPalindrome(arr[i])) {
                ans += arr[i]+" ";
            }
        }
        System.out.println(ans);
    }
}
