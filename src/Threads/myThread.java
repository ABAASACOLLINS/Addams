package Threads;

public class myThread extends Thread {

    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("the timer goes booom");
        }
        else {
            System.out.println("not daemon");
        }
    }
}