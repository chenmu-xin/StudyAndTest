package JavaBaseStudy.Generics;

import java.util.ArrayList;

public class ErasureProblem {
    // JVM 中不存在泛型，即泛型存在类型擦除问题，那么这有什么弊端？为什么？
    // 首先可以从 JVM 的角度考虑，因为在 JVM 中 根本么有泛型
    // 那么...

    public static void main(String[] args) {
        // 不能使用基本数据类型，其不属于类的范畴
        // ArrayList<double> list1 = new ArrayList<>();    // 错误
        ArrayList<Double> list2 = new ArrayList<>();	// 正确

        // 不能使用含参数化类型的数组，或，泛型数组
        // ArrayList<String> list3 = new ArrayList<String>[10];    // 错误
        // T[] name1 = new T[2];
        ArrayList<ArrayList<String>> list4 = new ArrayList<>();    // 正确

        // 不能在运行时进行类查询，因为他们会相等
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        if(list5.getClass() == list6.getClass()){
            System.out.println("Yes!");
        };   // 结果是true 他们是相等的。

        // 不能实例化类型变量
        // 比如不能 new T() ，其等价于 new Object();
    }



}
