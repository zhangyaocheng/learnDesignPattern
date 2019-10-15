/**
 * 生产接口
 * 用来固定生产结构
 */
public interface Builder {

    void buildA(); // 这里是抽象方法，用来构建某种类型的内容。保证创建者一定会实现相应方法
    void buildB();
    Product getResult();


}
