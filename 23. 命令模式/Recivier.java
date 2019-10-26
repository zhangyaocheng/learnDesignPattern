/**
 * 一个接收者
 * 用以接收命令并实现具体的操作
 *
 * 这里Recivier的职责是烧烤店厨师，可以有烤肉和考鸡翅两个类
 */
public class Recivier {

    public void kaoRou(){
        System.out.println("烤肉一份");
    }

    public void kaoJiChi(){
        System.out.println("烤鸡翅一份");
    }

}
