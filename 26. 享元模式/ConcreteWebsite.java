/**
 * 具体网站类
 * 实现网站使用方法
 */
public class ConcreteWebsite extends Website{

    private String name;
    public ConcreteWebsite(String name){
        this.name = name;
    }

    @Override
    public void use(User_ForWebsite user) {
        System.out.println("网站分类:"+name+" 用户:"+user.getName());
    }
}
