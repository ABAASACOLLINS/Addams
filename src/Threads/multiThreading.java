package Threads;

public class multiThreading {// process of using many threads simultaneously for serving many clients

    // maximises CPU  power and an exception in one thread doesnt affect another running thread because they are independent and parallel
    public static void main(
            String[] args
    ) throws InterruptedException {
        //there are two methods of creating a thread
        Thread1 thread1 = new Thread1(); //creating a class that extends the Thread class and maybe using constructors
        // method 2
        myRunnable runnable = new myRunnable();//creating a class that implements the runnable interface
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread1.join(2000);
        thread2.start();
        // we can use the join method so that we ensure one thread runs first then the other joins ()-for absolutely after the thread finishes
        //and (5000)- for the other thread taking that time before it starts

        System.out.println(1/0);
        // the main method as an exception but thread 1 and thread 2 work
    }


}
