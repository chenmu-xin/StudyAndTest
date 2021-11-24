package JavaThread.JdkConcurrence.Synchronized;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// ConditionsStudy 主要用于避免死锁的发生

public class ConditionStudy implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();

    @Override
    public void run() {
        try{
            lock.lock();
            condition.await();
            System.out.println("Thread is going on");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionStudy t1 = new ConditionStudy();
        Thread t2 = new Thread(t1);
        t2.start();
        Thread.sleep(2000);
        lock.lock();    // 唤醒之前先锁（唤醒之后会从锁的地方重新执行）
        condition.signal(); // 唤醒线程
        lock.unlock();  // 释放锁给线程

    }
}
