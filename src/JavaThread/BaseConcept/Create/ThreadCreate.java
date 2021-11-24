package JavaThread.BaseConcept.Create;

// 继承
public class ThreadCreate extends Thread{

    public static void main(String[] args) {
        ThreadCreate t1 = new ThreadCreate();
        t1.start();
    }

    @Override
    public void run() {
        while(true){
            System.out.println("task1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
