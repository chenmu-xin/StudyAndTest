package JavaBaseStudy.ReflectStudy.DynamicProxy;

public class Main {

    /**
     * 1. 定义一个接口及其实现类；
     * 2. 自定义 `InvocationHandler` 并重写`invoke`方法，在 `invoke` 方法中我们会调用原生方法（被代理类的方法）并自定义一些处理逻辑；
     * 3. 通过 `Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)` 方法创建代理对象；
     */

    public static void main(String[] args) {
        // 获得代理类对象
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        // 调用方法
        smsService.send("java");
    }





    // 此处描述为他人抽象出的指令知识，简单看即可

    /**
     //Proxy 类中使用频率最高的方法是：newProxyInstance() ，这个方法主要用来生成一个代理对象。

     // 参数：loader 类加载器，用于加载代理对象
     // 参数：interfaces 被代理类实现的一些接口
     // 参数：h 实现了 InvocationHandler 接口的对象
     public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
            throws IllegalArgumentException
    {
        //......
    }

     // 要实现动态代理的话，还需要实现 InvocationHandler 自定义处理逻辑，当我们动态的调用一个方法时，
     // 这个方法的调用会被转发到实现 InvocationHandler 接口类的 invoke 方法来调用
     public interface InvocationHandler {
     // 当你使用代理对象调用方法的时候实际会调用到这个方法

     // proxy:动态生成的代理类
     // method:与代理类对象调用的方法相对应
     // args:当前 method 方法的参数
     public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
     }

     // 也就是说：你通过`Proxy` 类的 `newProxyInstance()` 创建的代理对象在调用方法的时候，
     //实际会调用到实现`InvocationHandler` 接口的类的 `invoke()`方法。 你可以在 `invoke()` 方法中自定义处理逻辑，比如在方法执行前后做什么事情。




    **/

}
