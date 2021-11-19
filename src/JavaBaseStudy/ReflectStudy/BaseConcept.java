package JavaBaseStudy.ReflectStudy;

import JavaBaseStudy.ReflectStudy.BaseCode.TargetObject;

public class BaseConcept {
    // 反射：运行时分析类以及执行类中方法的能力，可以获取一个类任意的属性和方法
    // 优点：更加灵活；缺点：安全和性能稍差

    private static String test;

    public void BaseConcept(String test){
        this.test = "test";
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 虚拟机为每一个管理类型维护一个唯一的 Class 对象

        // class 类获取 方式

        // 1 通过具体类获取
        BaseConcept e = new BaseConcept();
        Class cl = e.getClass();
        System.out.println(" getClass(): " + cl);

        // 2 通过对象实例获取
        TargetObject o = new TargetObject();
        Class alunbarClass2 = o.getClass();
        System.out.println(alunbarClass2);

        // 3 通过路径获取
        Class forname = Class.forName("java.util.Random");
        System.out.println("forname():" + forname);

        // 4 通过类加载器+路径（不会初始化）获取，不会初始化
        // Class clazz = ClassLoader.loadClass("java.util.Random");

        // name 获取 方法
        String name = cl.getName();
        System.out.println(" getName(): " + name);

    }


}
