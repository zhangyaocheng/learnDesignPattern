/**
 * 网站抽象类
 * 可以称之为享元抽象类，共享的类都继承自该类
 */
public abstract class Website {

    public abstract void use(User_ForWebsite user); // 这里使用方法传递外部状态，这里外部对象就是用户状态

}
