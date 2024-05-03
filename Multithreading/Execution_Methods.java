package Multithreading;

public class Execution_Methods extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        // yield  method

        Execution_Methods s1 = new Execution_Methods();
        s1.start();
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }


    }
}
