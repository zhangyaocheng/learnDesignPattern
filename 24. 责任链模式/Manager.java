/**
 * 管理类
 * 包含一个设置上级类
 * 一个具体处理请求类
 */
public abstract class Manager {

    private String name;
    protected Manager supriorManager;

    public Manager(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSupriorManager(Manager supriorManager){
        this.supriorManager = supriorManager;
    }

    public abstract void ExecuteApplication(Request request);

}
