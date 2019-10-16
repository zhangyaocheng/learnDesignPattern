/**
 * SqlserverUser
 * 实现IUser接口，具体方法通过使用sqlserver中的方法实现
 */
public class SqlserverUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("通过sqlserver方法插入user对象");
    }

    @Override
    public void select(String id) {
        System.out.println("通过sqlserver返回ID="+id+"的user对象");
    }
}
