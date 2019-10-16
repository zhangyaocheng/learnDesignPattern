/**
 * 玩游戏的同事
 */
public class youxi implements Observe{

    private String name;
    private Subject subject;

    public youxi(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void doSomeThing() {
        System.out.println(subject.getAction()+" ,"+name+"关闭游戏，开始工作");
    }
}
