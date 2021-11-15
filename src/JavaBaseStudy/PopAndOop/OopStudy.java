package JavaBaseStudy.PopAndOop;

public class OopStudy {
    // 面向对象：把问题拆分成对象来解决
    // 例子：把大象放进冰箱需要三步：打开冰箱门、放进大象、关上冰箱门
    // 那么？把大象取出箱子？三步！OK！
    // 把猪杀掉，分成不同的肉块，放在冰箱中，并根据实际炒菜的需要，进行猪肉的取出？
    // 我想你可以做到，为每一次炒菜设计方法，设计if or for 书写最完美的逻辑？
    // 那么，如果杀掉的不是猪呢？如果放进的不是冰箱呢？如果不是用来炒菜呢？

    // 抽象化对象的组合

    public static void main(String[] args) {
        OopStudy popStudy = new OopStudy();
        popStudy.openBox();
        popStudy.enterBox();
        popStudy.closeBox();

    }

    public void openBox(){

    }

    public  void  closeBox(){

    }

    public void enterBox(){

    }

}
