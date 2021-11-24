package JavaThread.BaseConcept.Interrupt;

// 线程中断的使用
public class InterruptAndSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Interruted!");
                        break;
                    }
                    System.out.println("123");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Interruted When Sleep");
                        Thread.currentThread().interrupt(); // sleep时，需要重设中断状态，否则会因为异常而被清除掉
                        e.printStackTrace();
                    }
                    Thread.yield(); // 让步
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }



}
