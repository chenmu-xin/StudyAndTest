package JavaBaseStudy.Generics;

import javafx.util.Pair;

import java.io.Serializable;
import java.util.ArrayList;

public class BaseConcept {

    // -------------------------------------------------------------------------

    // 什么是泛型？ 可以表示多种类型的类型，或者说类型的泛化表示
    // 为什么需要泛型？ 为了类型使用的安全
    // 类型使用的安全？怎么不安全了？ 在使用 Object 代表一种类型的时候，可能会“上错花轿嫁错郎“
    // 泛型的应用？有什么例子？ 通过 泛型 限制 类型参数 在一定的范围，实现不同类型的重用，例如 ArrayList

    public void ArrayListDemo(){
        ArrayList<String> listdemo = new ArrayList<>();
        // 这行报错，但是总比运行后 error 强不是么？
        // listdemo.add(1.0);
    }

    // -------------------------------------------------------------------------

    // 什么是类型限定？
    // 答：可以更广泛的 限定泛化（extends 是一种父限定的概念）
    public static <T extends Comparable>T function(T[] a){
        return a[0];

    }
    public class classname<T extends Comparable & Serializable> implements Serializable{

    }

    // -------------------------------------------------------------------------

    // 什么是类型擦除？
    // 答：JVM中不存在泛型，在运行时会根据实际类型对泛型类型进行 擦除
    public static <T extends Comparable> T function1(T[] a){ // 泛型方法擦除前
        return a[0];
    }
    public static Comparable min(Comparable[] a){   // 泛型方法擦除后
        return a[0];
    }

    // -------------------------------------------------------------------------

    // 思考：类型擦除后会清除方法的泛型，可能导致签名不唯一（例如：泛型方法擦除后，与继承来的方法冲突）
    // 解决方案有二：建立桥方法实现多态 + 将返回值作为签名

    // classname 继承与 Pair
    // 但 Classname 和 Pair 都具有setSecond 方法
    // 且 类型擦除后，两者签名一致，是如何实现多态的？如下

    /**
     class Classname extends Pair<LocalDate> { 实现 setSecond( LocalDate localDate )方法 }  // 但 Pair 中也有 setSecond()方法

     Pair<LocalDate> pair = new Classname(...);     // 这里实现的是 pair 的子类 classname 对象
     pair.setSecond(aDate);     // 故此处调用的是 classname 的方法，那么经过类型擦除是如何调用的呢？

     public void setSecond(Object second){ setSecond(LocalDate) second }    // 可见，通过桥方法，利用返回值作为 签名
     **/




}
