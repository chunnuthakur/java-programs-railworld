package Abstraction.Interface;

interface NewFeatures {
    int a = 10;

    default void display() {
        System.out.println(a);
        essential();
    }

    static void moreInfo() {
        System.out.println("In Java- 8 and 9 added  new  features like default method and static method");
    }

    private void essential() {
        System.out.println("import");
    }
}

public class Java_8_9_feature implements NewFeatures {


    public static void main(String[] args) {
        NewFeatures.moreInfo();
        Java_8_9_feature s = new Java_8_9_feature();
        s.display();
    }
}
