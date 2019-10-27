import java.util.HashMap;

/**
 * 网站工厂类
 * 通过使用该工厂类达到共享的目的，使得同一个类型的对象只会有一个实例
 */
public class WebsiteFactory {

    private HashMap<String,ConcreteWebsite> map = new HashMap<>(); // 存储所有的享元对象

    public Website createConcreteWebsite(String key){ // 构建享元对象，每一个具体对象只会出现一次
        if (!map.containsKey(key)){
            map.put(key,new ConcreteWebsite(key));
        }
        return map.get(key);
    }

    public int getCount(){
        return map.size();
    }

}
