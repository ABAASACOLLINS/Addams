package Threads;

public class myRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 1000; ) {
            System.out.println("thread2; " + i);
            i = i + 100;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("thread 2 is done");
    }
}
