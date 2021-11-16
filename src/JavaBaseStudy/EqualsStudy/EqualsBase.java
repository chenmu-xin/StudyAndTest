package JavaBaseStudy.EqualsStudy;

public class EqualsBase {

    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String aa = "ab";
        String bb = "ab";

        // 字符串值 相等
        if( aa == bb )
            System.out.println("aa == bb");

        // 对象的地址值 不相等
        if( a == b)
            System.out.println(" a == b ");

        // String 重写了 equals() 方法，比较的是实际的值，相等
        if( a.equals(b) )
            System.out.println("a EQ b");

        /*

        if( 42 == 42.0)
            System.out.println("42 == 42.0");

        */

    }



    // String 重写的 equals() 方法
    // String 类中 value 或 this.value 存有本字符串，anObject 为待比较的字符串
    /**
    public boolean equals(Object anObject) {
        // 如果是同一个对象，直接 true
        if (this == anObject) {
            return true;
        }
        // instanceof 对象 和 类实例 是否匹配
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            // 先比较长度
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                // 依次比较内容，可以看出，其实 String 是一个 char[]
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
    **/

    // 注意，HashSet, Hashtable, HashMap 等使用了hash表的结构，会先比较 hash 值，在进行 equals()

    /**
     * String hashCode()
     * 如何覆盖 hashCode() ?????
     * String 方法 进行了简单的拼接计算，这个计算过程是自定义的，也就是 散列函数！
     *
     *     public int hashCode() {
     *         int h = hash;
     *         if (h == 0 && value.length > 0) {
     *             char val[] = value;
     *
     *             for (int i = 0; i < value.length; i++) {
     *                 h = 31 * h + val[i];
     *             }
     *             hash = h;
     *         }
     *         return h;
     *     }
     */




}
