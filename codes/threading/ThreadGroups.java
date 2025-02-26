package codes.threading;

import java.io.FileNotFoundException;
import java.util.Arrays;

class Handler extends Throwable{
    Handler(){
        super("Created by Custom Handler");
    }
}

public class ThreadGroups {

    public static void main(String[] args) throws Exception {

        /*

        Thread Groups : helpful for handling exceptions, setting priorities

         */
        ThreadGroup threadGroup = new ThreadGroup("kartik-threads");
        threadGroup.setMaxPriority(4);

        Thread t1 = new Thread(threadGroup,()-> {
                throw new RuntimeException();
        }, "thread-1");
        t1.setPriority(5); // it will automatically reduce priority to 4

        threadGroup.uncaughtException(t1, new Handler());

        t1.start();
        // output will be
        // Exception in thread "thread-1" codes.threading.Handler: Created by Custom Handler


        Thread t2 = new Thread(threadGroup,()-> System.out.println("t2"));
    }
}
