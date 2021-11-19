package JavaBaseStudy.ReflectStudy.StaticProxy;

// 发短信接口的实现类
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
