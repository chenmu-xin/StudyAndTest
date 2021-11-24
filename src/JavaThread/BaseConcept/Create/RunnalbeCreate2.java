package JavaThread.BaseConcept.Create;

// 函数式接口 书写方式
public class RunnalbeCreate2 {
    public static void main(String[] args) {
        Runnable task1 = ()->
        {
            while(true){
                System.out.println("task1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        new Thread(task1).start();
    }

}
