package JavaBaseStudy.ReflectStudy.BaseCode;

public class TargetObject {
    private String value;

    public TargetObject() {
        value = "XiaoHuangHuang";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("I favorite " + value);
    }

}
