/**
 * 玩股票的同事
 */
public class GuPiao implements Observe{

    private String name;
    private Subject subject;

    public GuPiao(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void doSomeThing() {
        System.out.println(subject.getAction()+" ,"+name+"关闭股票，开始工作"); // 这里监控相关行为
    }
}
