package String_Questions;

import java.util.Scanner;

public class Number_Of_Word_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        System.out.println(arr.length);
    }
}
