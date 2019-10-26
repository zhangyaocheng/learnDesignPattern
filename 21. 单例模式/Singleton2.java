/**
 * 单例模式
 * 懒汉模式
 * 线程安全方式1，双重验证
 */
public class Singleton2 {

    private static Singleton2 singleton = null; //静态私有化变量

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (singleton==null){
            synchronized (Singleton2.class){ // 这里使用同步锁，锁的范围是整个类对象
                if (singleton==null){
                    singleton = new Singleton2();

                }
            }
        }
        return singleton;
    }

}
