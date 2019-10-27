/**
 * 美国继承自国家类
 */
public class American extends Country{

    public American(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void send(String message){
        //这里使用具体的中介者类处理相关信息。
        unitedNations.send(message,this);
    }

    public void GetMessage(String message){
        System.out.println("美国获取对象信息:"+message);
    }
}
