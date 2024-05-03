package StringBuffer;

public class StringBuffer_Methods {
    public static void main(String[] args) {
        String s = "Ganesh";
        StringBuffer s1 = new StringBuffer("Ganesh kushwah");
        System.out.println(s1.length());

        System.out.println(s1);
//        s1.insert(0,"Ganesh ");
        s1.deleteCharAt(2);
        System.out.println(s1);

        s1.insert(1, 7);
    }
}
