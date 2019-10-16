/**
 * IUser接口
 *
 * 实现数据库操作的接口
 */
public interface IUser {

    void insert(User user);
    void select(String id);

}
