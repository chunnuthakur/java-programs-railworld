package Abstraction.Interface;

interface one_1 {
    int x = 56;
}

interface second_2 {
    int x = 78;
}

public class Both_have_same_variable implements one_1, second_2 {
    public static void main(String[] args) {
         Both_have_same_variable s= new Both_have_same_variable();
//        System.out.println(s.x);
        System.out.println(one_1.x);
        System.out.println(second_2.x);
    }
}
