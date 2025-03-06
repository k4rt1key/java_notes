package codes.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Locks {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock ll = new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        ll.lock();
        ll.tryLock();
        ll.lockInterruptibly();

        ll.isLocked();
        ll.getHoldCount();
        ll.getQueueLength();
//        ll.getWaitQueueLength();

        ll.isFair();
        ll.isHeldByCurrentThread();
    }
}
