import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 * 接收命令
 */
public class Waiter {

    private List<Command> list = new ArrayList<>();

    public void setCommand(Command command){
        list.add(command);
    }

    public void Remove(Command command){
        list.remove(command);
    }

    public void Notify(){
        for (Command item:list){
            item.ExecuteCommand();
        }
    }

}
