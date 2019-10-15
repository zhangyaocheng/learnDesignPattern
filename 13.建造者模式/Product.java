import java.util.ArrayList;
import java.util.List;

/**
 * 产品类
 * 用来存放产品内容
 */
public class Product {

    List<String> list = new ArrayList<>();

    public void Add(String part){
        list.add(part);
    }

    public void show(){
        System.out.println("产品 创建-----");
        for (String item:list){
            System.out.print(item+" ");
        }
    }

}
