/**
 * 外观模式使用类
 * 封装了子系统的借口
 *
 * 可以在外观类中进行同一个逻辑处理并封装
 */
public class Facade {

    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA(){
        one.methodOne();
        three.methodThree();
    }

    public void methodB(){ // 这里的方法可以进行逻辑排列，重新封装。对外部提供同一个操作界面。因此称为外观模式
        three.methodThree();
        one.methodOne();
        two.methodTwo();
    }


}
