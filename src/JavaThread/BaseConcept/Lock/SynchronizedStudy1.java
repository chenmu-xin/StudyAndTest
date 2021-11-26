package JavaThread.BaseConcept.Lock;

// 对象锁 正确

public class SynchronizedStudy1 implements Runnable {
    static SynchronizedStudy1 instance = new SynchronizedStudy1();
    static int i = 0;

    @Override
    public void run() {
        for(int j = 0 ; j < 100000 ; j++){
            // 此处加锁
            synchronized (instance){
                i++;
            }
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
