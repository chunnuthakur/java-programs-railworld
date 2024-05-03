package Abstraction.Interface;

import javax.sound.midi.Soundbank;

interface Sky {
    void color();

    void rainbow();
}

abstract class Sky1 implements Sky {
    public void color() {
        System.out.println("blue");
    }

    public void rainbow() {
        System.out.println("Ganesh");

    }
}

public class Methods_Implimentation extends Sky1 {
    public static void main(String[] args) {
        System.out.println("Ganesh , it is good for my ");

    }
}
