package JavaThread.JdkConcurrence.JdkStudy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapStudy {
    // 可以考虑的方法，其底层通过synchronized 实现了同步，例如：synchronized(mutex){ return m.get(key); }
    public static Map m = Collections.synchronizedMap(new HashMap());

    // 当然最好是
    ConcurrentHashMap m2 = new ConcurrentHashMap();

}
