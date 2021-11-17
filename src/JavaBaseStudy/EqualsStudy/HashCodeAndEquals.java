package JavaBaseStudy.EqualsStudy;

public class HashCodeAndEquals {
    // 什么是 HashCode() 方法？ 他和 equals() 有什么关系

    // 多次比较值是非常浪费时间的行为，那么要如何进行解决呢？
    // 通过 散列表快速定位的特点，即先 hashCode 再 比较值！
    // 比如常用的 HashSet, Hashtable, HashMap ！

    // Object 类中的 hashCode 方法
    /*
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    */

    // hashCode() 方法 如何重写？
    // 例如下面是一种拼接计算的方式

    private String num; // 学生的学号
    private String name;    // 学生的姓名

    // 通过拼接学生的学号和姓名，生成 hashcode
    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append(name);
        char[] charArr = sb.toString().toCharArray();
        int hash = 0;

        for(char c : charArr) {
            hash = hash * 131 + c;
        }
        return hash;
    }

    // 为什么重写 equals() 方法，必须重写 hashcode() 方法
    // 如果不重写 hashcode() 方法，将无法使用 HashSet, Hashtable, HashMap 存储该对象，因为无法使用 hashcode()方法进行判断


}
