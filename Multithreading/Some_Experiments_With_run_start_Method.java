package Multithreading;

public class Some_Experiments_With_run_start_Method extends Thread {

    public void run() {
        System.out.println("Run method");
    }

    public void start() {
        super.start();
        System.out.println("Start method");
    }

    public void run(int a) {
        System.out.println("Overloaded run method");
    }

    public static void main(String[] args) {

        Some_Experiments_With_run_start_Method s = new Some_Experiments_With_run_start_Method();
        s.start();
    }
}
