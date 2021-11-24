package JavaThread.BaseConcept.Lock;

// 方法锁 正确

public class SynchronizedStudy2 implements Runnable {
    static SynchronizedStudy2 instance = new SynchronizedStudy2();
    static int i = 0;

    // 此处加锁
    public synchronized void increase(){
        i++;
    }

    @Override
    public void run() {
        for(int j = 0 ; j < 100000 ; j++){
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();  // 等线程执行结束
        t2.join();
        System.out.println(i);
    }

}
