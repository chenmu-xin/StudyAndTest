package JavaThread.JdkConcurrence.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FIxedThreadPoolStudy implements Runnable{
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + ":Thread ID:"
                + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        FIxedThreadPoolStudy task = new FIxedThreadPoolStudy();
        // 线程池函数
        // ExecutorService es = Executors.newFixedThreadPool(5);
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 0; i < 10 ;  i++){
            es.submit(task);
        }

    }
}
