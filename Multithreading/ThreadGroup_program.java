package Multithreading;

public class ThreadGroup_program implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());


    }

    public static void main(String[] args) {

        ThreadGroup_program thread = new ThreadGroup_program();

        ThreadGroup tg1 = new ThreadGroup("Parent Thread");
        Thread tg2 = new Thread(tg1, thread, "start");
        tg2.start();

        Thread tg3 = new Thread(tg1, thread, "the");
        tg3.start();

        Thread tg4 = new Thread(tg1, thread, "work");
        tg4.start();

        System.out.println("Thread Group Name:" + tg1.getName());
        tg1.list();


    }

}
