/**
 * 单例模式1
 * 饿汉模式
 * 初始化即实现实例的生成
 */
public class Singleton1 {

    private static volatile Singleton1 singleton = new Singleton1(); // 类的私有静态属性，无法被直接访问，仅在类的加载阶段加载一次。

    private Singleton1(){}

    public Singleton1 getInstance(){ // 一个类方法，可以直接返回类的静态属性
        return singleton;
    }

}
