package codes.threading;

class Task extends Thread{ // method 1
    @Override
    public void run(){
        while (true) {
            System.out.println("thread " + Thread.currentThread().getName() + " is running in the background");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { // we have to surround this in try catch because Thread class doesn't have thorws exception
                // in it's method signature
                throw new RuntimeException(e);
            }
        }
    }

}


class SecondTask implements Runnable {

    @Override
    public void run() {
        System.out.println("thread " +  Thread.currentThread().getName() + " is running for 10seconds");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread " +  Thread.currentThread().getName() + " is done running for 10seconds");
    }
}

public class Creation {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task(), "thread-1");

        t1.setDaemon(false);

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t1.setPriority(Thread.NORM_PRIORITY); // 5
        t1.setPriority(4);
        /*
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t1.getThreadGroup());
        System.out.println(t1.toString()); // Thread[Thread-1,4,main] : Thread-1 ( name ), 4 ( priority ), main ( thread group )
        System.out.println(t1.isDaemon());
        System.out.println(t1.isAlive());
        System.out.println(t1.isInterrupted());
        System.out.println(t1.getState());
        System.out.println(t1.getThreadGroup());
        */
        ThreadGroup threadGroup = new ThreadGroup("Worker Threads");
        Thread t2 = new Thread(threadGroup, new SecondTask(), "worker-1");

        t1.start();
        t2.start();

//        t2.join();
        // we are not mentioning t1.join() because we set t1.setDaemon(true)
        // so t1 is running on background and when t2 will finish t1 also will finish

        // but if we set t1.setDaemon(false)
        // it will foreever execute it's while loop ( written in t1.run() method )
    }
}
