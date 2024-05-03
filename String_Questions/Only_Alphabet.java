package String_Questions;

import java.util.Scanner;

public class Only_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}
