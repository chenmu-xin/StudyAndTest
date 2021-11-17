package JavaBaseStudy.DataType;

public class BaseConcept {

    // 基本数据类型
    // 8    16     32      64
    // byte short  int     long
    //      char   float   double
    // 其他：void  boolean
    // 注意：String 为 char[] 非基本数据类型

    // -----------------------------------------------------------------------------------

    // 自动拆装箱
    // 装箱：基本类型 包装成 引用类型
    // 拆箱：引用类型 拆分为 基本类型

    Integer i = 10; // 装箱
    int n = i;  // 拆箱

    Integer i1 = Integer.valueOf(10);    // 装箱
    int n1 = i1.intValue(); // 拆箱

    // 包装类型？ Boolean Character Byte Short Integer Long Float Double Void

    // -----------------------------------------------------------------------------------

    // 常量池
    // 当基本类型在某个固定范围内时，常量池技术不需要多次封装，而是直接在 池 中取值赋予 ！（ummmm,其实就是节省点内存空间）
    // `Byte`,`Short`,`Integer`,`Long` 这 4 种包装类默认创建了数值 [-128，127] 的相应类型的缓存数据
    // `Character` 创建了数值在[0,127]范围的缓存数据
    // `Boolean` 直接返回 `True` or `False`。
    // `Float`,`Double` 并没有实现常量池技术。

    /**
     *此方法将始终缓存-128 到 127（包括端点）范围内的值，并可以缓存此范围之外的其他值。
     */
    /**
    // Integer 缓存源码
    // 主要通过数组存储直接返回
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }

    private static class IntegerCache {
        static final int low = -128;
        static final int high;
        static final Integer cache[];
    }
    **/

    // 应用,结果为 false
    public static void main(String[] args) {
        Integer i1 = 40;    // 自身值
        Integer i2 = new Integer(40);   // 常量池取
        System.out.println(i1==i2); // false
    }


}
