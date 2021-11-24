package JavaThread.BaseConcept.Create;

// 接口实现
public class RunnableCreate implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableCreate());
        t1.start();
    }

    @Override
    public void run() {
        while(true){
            System.out.println("runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
