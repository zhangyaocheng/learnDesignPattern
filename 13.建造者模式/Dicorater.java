/**
 * 构建者
 * 用来构建目标对象
 */
public class Dicorater {

    public void createProduct(Builder builder){ // 构建对象
        builder.buildA();
        builder.buildB();
    }

}
