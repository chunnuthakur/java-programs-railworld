package Inheritance;

class Railword_ {
    public void Policy() {
        System.out.println("100 days training");
        System.out.println("Ready to relocation");
        System.out.println("30 days Notice period");
    }
}

class Indore_Office extends Railword_ {
    public void timing() {
        System.out.println("9:30 AM to 6:30 PM");
    }
}

class Gurugram_Office extends Railword_ {
    public void timing() {
        System.out.println("9:30 AM to 6:30 PM");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Indore_Office s1 = new Indore_Office();
        s1.Policy();
        s1.timing();
        System.out.println();
        Gurugram_Office g1 = new Gurugram_Office();
        g1.Policy();
        g1.timing();
    }
}
