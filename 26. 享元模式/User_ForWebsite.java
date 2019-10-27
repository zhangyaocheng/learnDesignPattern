/**
 * 使用网站的客户
 * 这里使用这个类保存外部状态，也就是用户名
 */
public class User_ForWebsite {

    private String name;
    public User_ForWebsite(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
