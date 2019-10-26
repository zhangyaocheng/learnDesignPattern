/**
 * 命令抽象类
 */
public abstract class Command {

    protected Recivier recivier;

    public Command(Recivier recivier){ // 这里的Recivier类可以是抽象类，但是为了简单这里做了具体类接收烧烤命令
        this.recivier = recivier;
    }

    public abstract void ExecuteCommand();

}
