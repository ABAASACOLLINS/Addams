package Threads;

public class Thread1 extends Thread {
    public  void run(){
        for (int i=1000;i>0;){
            System.out.println("thread1; "+i);
            i=i-200;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("thread 1 is done");
    }
}
