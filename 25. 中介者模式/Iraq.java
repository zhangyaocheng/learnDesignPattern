/**
 * 伊拉克类
 */
public class Iraq extends Country{

    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void send(String message){
        unitedNations.send(message,this);
    }

    public void getMessage(String message){
        System.out.println("伊拉克获取对象消息:"+message);
    }
}
