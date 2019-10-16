import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Boss类
 * 实现主题类
 */
public class Boss implements Subject {

    private Vector<Observe> observes = new Vector<>(); // 存放观察者列表
    private String action;

    @Override
    public void Add(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void Remove(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void Notify() {
        for (Observe item:observes){
            item.doSomeThing();
        }
    }

    public void setAction(String action){
        this.action = action;
    }

    public String getAction(){return this.action;}
}
