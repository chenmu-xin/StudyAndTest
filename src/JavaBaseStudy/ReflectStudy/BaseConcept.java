package JavaBaseStudy.ReflectStudy;

public class BaseConcept {
    // 反射：运行时分析类以及执行类中方法的能力，可以获取一个类任意的属性和方法
    // 优点：更加灵活；缺点：安全和性能稍差

    private static String test;

    public void BaseConcept(String test){
        this.test = "test";
    }

    public static void main(String[] args) {
        // class 类获取 class or name
        // 虚拟机为每一个管理类型维护一个唯一的 Class 对象
        BaseConcept e = new BaseConcept();
        Class cl = e.getClass();
        System.out.println(" getClass(): " + cl);
        String name = cl.getName();
        System.out.println(" getName(): " + name);

        // Class forname = Class.forName("java.util.Random");



    }


}
