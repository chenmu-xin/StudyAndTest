package JavaBaseStudy.Generics;

import java.util.ArrayList;

public class BaseConcept {
    // 什么是泛型？ 表示不是一种类型的类型，或者说类型的泛化表示
    // 为什么需要泛型？ 为了类型使用的安全
    // 类型使用的安全？怎么不安全了？ 在使用 Object 代表一种类型的时候，可能会“上错花轿嫁错郎“
    // 泛型的应用？有什么例子？ 通过泛型限制类型参数在一定范围，实现不同类型的重用，例如 ArrayList

    public void ArrayListDemo(){
        ArrayList<String> listdemo = new ArrayList<>();
        // 这行报错，但是总比运行后 error 强不是么？
        // listdemo.add(1.0);
    }

}
