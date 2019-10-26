/**
 * 单例模式
 * 使用静态内部类构造
 */
public class Singleton3 {

//    private static volatile Singleton3 singleton3 = null;

    private Singleton3(){}

    private static class InnerClass{
        private static volatile Singleton3 singleton3= new Singleton3();
    }

    public Singleton3 getInstance(){
        return InnerClass.singleton3;
    }

}
