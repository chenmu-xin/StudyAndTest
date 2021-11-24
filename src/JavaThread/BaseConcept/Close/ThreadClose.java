package JavaThread.BaseConcept.Close;

public class ThreadClose extends Thread{

    volatile boolean stopme = false;

    public void Stopme(){
        stopme = true;
    }


    @Override
    public void run() {
        while(true){
            // 线程关闭
            if(stopme){
                System.out.println("stop");
                break;
            }

            System.out.println("task1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadClose t1 = new ThreadClose();
        t1.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.Stopme();

    }

}
