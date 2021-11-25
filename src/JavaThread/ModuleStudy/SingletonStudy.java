package JavaThread.ModuleStudy;

// 单例模式的实现
public class SingletonStudy {
    private SingletonStudy(){

        System.out.println("Singleton is create");
    }

    private static SingletonStudy instance = new SingletonStudy();

    public static SingletonStudy getInstance(){

        return instance;
    }
}
