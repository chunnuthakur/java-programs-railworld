package Multithreading;

public class Using_Runnable_Interface implements Runnable {

    @Override
    public void run() {
        System.out.println("Ganesh ,now your");
    }

    public static void main(String[] args) {
        Runnable s = new Using_Runnable_Interface();

//        Thread s1 = new Thread(s);
//        s1.start();
//        s1.setName("Ganesh it is one of the bexr thread");
//        System.out.println(s1.getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();

    }
}
