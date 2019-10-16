/**
 * 主题类
 * 用来实现通知的抽象类
 * 包含有观察者抽象类
 */
public interface Subject {

    void Add(Observe observe);
    void Remove(Observe observe);
    void Notify();
    String getAction();
    void setAction(String action);

}
