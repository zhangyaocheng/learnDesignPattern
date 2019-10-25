import java.util.ArrayList;
import java.util.List;

/**
 * 具体简单集合类
 */
public class ConcreateSimpleSet extends SimpleSet{

    private List<Object> list = new ArrayList<>();

    public void Add(Object item){
        list.add(item);
    }

    public void Remove(Object item){
        list.remove(item);
    }

    public Object get(int Indext){
        return list.get(Indext);
    }

    public int getCount(){
        return list.size();
    }

    @Override
    public Iterator_FORTEST createIterator() {
        return new ConcreateIterator(this);
    }
}
