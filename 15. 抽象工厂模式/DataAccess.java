/**
 * DataAccess类
 * 通过反射返回响应数据库操作类
 * 通过配置文件完成对数据库的选择
 */
public class DataAccess {

    private static String db = new ReadConfigFile().getValue("/DB.properites","db");


    //通过反射实现创建相关对象的方法
    //通过反射，避免了使用swtich分支确定指定类的情况
    //这样，直接在className中写好类的全程限定名即可。
    public IUser createUser()  {
        String className = db+"User";
        IUser result = null;
        try {
            result = (IUser)Class.forName(className).newInstance(); // 通过反射返回对象，不需要用Reflect包
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }


}
