/**
 * 抽象迭代器类
 * 这里由于java中已经有Iterator对象因此使用其他名称代替
 */
public abstract class Iterator_FORTEST {

    public abstract Object First(); // 返回第一个元素
    public abstract Object Next(); // 返回下一个元素
    public abstract boolean IsDone();//是否结尾
    public abstract Object CurrentItem(); // 返回当前元素
}
