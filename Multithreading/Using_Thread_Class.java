package Multithreading;

public class Using_Thread_Class extends Thread {

    public void run() {
        System.out.println("This is multithreading");
        for (int i = 0; i < 6; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        Using_Thread_Class obje = new Using_Thread_Class();
        obje.start();
        for (int i = 0; i < 6; i++) {
            System.out.println("Main Thread");
        }
    }
}
