package JavaThread.BaseConcept.Lock;

// 方法锁 正确（3错误改正）静态

public class SynchronizedStudy4 implements Runnable {
    static SynchronizedStudy4 instance = new SynchronizedStudy4();
    static int i = 0;

    // 此处加锁(3 错误改正此处，static)
    public static synchronized void increase(){
        i++;
    }

    @Override
    public void run() {
        for(int j = 0 ; j < 100000 ; j++){
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 错误，此处建立两个新对象，不是一个对象了
        Thread t1 = new Thread(new SynchronizedStudy4());
        Thread t2 = new Thread(new SynchronizedStudy4());
        t1.start();
        t2.start();
        t1.join();  // 等线程执行结束
        t2.join();
        System.out.println(i);
    }

}
