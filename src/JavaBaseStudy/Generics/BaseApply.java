package JavaBaseStudy.Generics;

// 泛型类可以有多个 类型变量（心理：什么鬼？没懂呀？）
// 那么...像不像...没错...Map<K,V> !!!! 集合中的 Map 就是泛型类的最好应用
// 同样，泛型方法就是我们常用的，返回值是 ArrayList<String> 这类的方法啦！
public class BaseApply<T, U> {

    private T first;
    private T second;

    public BaseApply() { first = null; second = null;}
    public BaseApply(T first ,T second) { this.first = first ; this.second = second; }

    public T getFirst(){ return first; }
    public T getSecond(){ return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }

}
