package JavaThread.BaseConcept.Create;

// 匿名内部类
public class ThreadCreate2 extends Thread{

    public static void main(String[] args) {
        ThreadCreate2 t1 = new ThreadCreate2(){
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
        };
        t1.start();
    }

}
