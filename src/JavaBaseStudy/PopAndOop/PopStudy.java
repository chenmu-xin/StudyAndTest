package JavaBaseStudy.PopAndOop;

public class PopStudy {
    // 面向过程：把问题当成一个过程来解决
    // 例子：把大象放进冰箱需要三步：打开冰箱门、放进大象、关上冰箱门

    // 结构化函数的调用

    private String daxiang;


    public static void main(String[] args) {
        PopStudy popStudy = new PopStudy();
        popStudy.openBox();
        popStudy.enterBox();
        popStudy.closeBox();
    }

    public void openBox(){

    }

    public  void  closeBox(){
      this.daxiang = "没想到吧，我现在在冰箱里面了！";
    }

    public void enterBox(){

    }

}
