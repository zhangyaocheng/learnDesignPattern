/**
 * 外籍中锋
 */
public class ForenMiddlePlaer {

    private String name;

    public ForenMiddlePlaer(String name){
        this.name = name;
    }

    public void jingong(){
        System.out.println("中锋 "+name+" 进攻");
    }

    public void fangshou(){
        System.out.println("中锋 "+name+" 防守");
    }
}
