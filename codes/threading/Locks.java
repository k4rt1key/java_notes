package codes.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock ll = new ReentrantLock();

        ll.lock();
        ll.tryLock();
        ll.lockInterruptibly();

        ll.isLocked();
        ll.getHoldCount();
        ll.getQueueLength();
        ll.getWaitQueueLength();
        ll.isFair();
        ll.isHeldByCurrentThread();
    }
}
