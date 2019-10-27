import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 */
public class ObjectStructure {

    List<Human> list = new ArrayList<>();

    public void Add(Human human){
        list.add(human);
    }

    public void Remove(Human human){
        list.remove(human);
    }

    public void Show(Action action){
        for (Human item:list){
            item.Accept(action);
        }
    }

}
