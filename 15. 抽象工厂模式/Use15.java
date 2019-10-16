public class Use15 {
    /**
     * 使用类
     */

    public static void main(String[] args){

        DataAccess access = new DataAccess();
        IUser iUser = access.createUser(); // 这里使用sqlserver，因为在配置文件中配置的是sqlserver；
        User user = new User();
        iUser.insert(user);
        iUser.select("13");

    }

}
