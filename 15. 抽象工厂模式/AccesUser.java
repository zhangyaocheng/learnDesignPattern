/**
 * AccessUser
 *
 * 实现IUser接口，相关方法通过Acces内的方法实现
 */
public class AccesUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("通过Access方法插入User对象");
    }

    @Override
    public void select(String id) {
        System.out.println("通过Acces方法返回ID="+id+"的User对象");
    }
}
