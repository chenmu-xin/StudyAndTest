package JavaThread.JdkConcurrence.Synchronized;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockStudy implements Runnable {
    // 什么是重入？可以反复的锁多次，同时也需要释放对应的次数
    // 主要通过 ReentrantLock 的  lock()  and   unlock()   来实现
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0 ; j < 100000 ; j++){
            lock.lock();
            try{
                i++;
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockStudy t1 = new ReentrantLockStudy();
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t1);
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println(i);
    }
}
