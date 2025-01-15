package Threads;

public class threads {
    // threads are like a virtual cpu where the jvm has multiple threads running in parallelwhen a programme is running
    // they run alongside a main thread for the main method
    //there are high priority threads and low priority threads
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        // for the number of threads that are acitve
        Thread.currentThread().setName("ainoo");// setting the name of the current thread
        System.out.println(Thread.currentThread().getName());// to get the name of the thread thats running
        System.out.println(Thread.currentThread().getPriority()); //to get the priority value which is on a scale of 1 to 10
        Thread.currentThread().setPriority(9);// to set the priority of the thread
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());// check if is alive
        // you can use the sleep method as a couner
        for (int i=10;i>0; ){
            System.out.println(i);
            Thread.sleep(2000);
            i=i-2;
        }
        System.out.println("woweeeee");
        // to create a new thread
        myThread threads=new myThread();
        System.out.println( threads.isAlive());// the thread is dead because we need to start it
        threads.start(); // this also causes the run method to run
        System.out.println(threads.getName());// we can change name using the setName method
        System.out.println(threads.getPriority());// has a priority of five which is the default howeve since it extends the Thread class which is the main thread then it also inherits the priority which is nine
        System.out.println(Thread.activeCount());

    }
}
