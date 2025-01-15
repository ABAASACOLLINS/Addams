package Threads;

public class types {
    public static void
    main(String[]args){
        //there are two types of threads
        //daemon threads which run in the background and are also called nonuser threads
        //user threads-created by the user jvm closed when all thisthreads are closed
        myThread Threads=new myThread();
        System.out.println(Thread.activeCount());

        System.out.println(Threads.isDaemon()); // to check if its a daemon
        Threads.setDaemon(true);// to make it a daemon
        Threads.start();
        System.out.println(Threads.getPriority());
    }
}
