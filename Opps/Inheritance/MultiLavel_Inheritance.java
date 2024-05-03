package Inheritance;

class Vivo {
    public void Camera_Capacity() {
        System.out.println("Good");
    }

    public void Sound_Quality() {
        System.out.println("Better");
    }

    public void Updated_Version() {
        System.out.println("Version 1.5");
    }
}

class Vivo_Y20 extends Vivo {
    public void Price() {
        System.out.println("450 rs");
    }
}

public class MultiLavel_Inheritance extends Vivo_Y20 {
    public static void main(String[] args) {
        MultiLavel_Inheritance s1 = new MultiLavel_Inheritance();
        s1.Camera_Capacity();
        s1.Price();
        s1.Sound_Quality();
        s1.Updated_Version();
    }

}
