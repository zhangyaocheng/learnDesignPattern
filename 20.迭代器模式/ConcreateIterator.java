/**
 * 具体迭代类
 * 继承实现抽象迭代器类
 */
public class ConcreateIterator extends Iterator_FORTEST{

    private ConcreateSimpleSet simpleSet;
    private int current = 0;

    public ConcreateIterator(ConcreateSimpleSet simpleSet){
        this.simpleSet = simpleSet;
    }

    @Override
    public Object First() {
        return simpleSet.get(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if (current<simpleSet.getCount()){
            ret = simpleSet.get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        if (current<simpleSet.getCount()){
            return false;
        }
        return true;
    }

    @Override
    public Object CurrentItem() {
        return simpleSet.get(current);
    }
}
