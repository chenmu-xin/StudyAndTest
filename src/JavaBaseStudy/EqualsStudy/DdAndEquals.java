package JavaBaseStudy.EqualsStudy;

public class DdAndEquals {
    // ==  and  equals()
    // == 比较的是值，这个值可能是真实的值，也可能是地址的值
    // equals() 是 Object 类中的方法，要看类有没有对他进行覆盖

    // 没有覆盖的时候 equals() 是等价于 == 的
    // Object 类 equals() 方法
    public boolean equals(Object obj) {
        return (this == obj);
    }




}
