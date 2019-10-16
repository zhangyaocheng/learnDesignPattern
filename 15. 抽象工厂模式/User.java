/**
 * 普通User类
 * 包含有姓名和ID
 */
public class User {

    private String _ID;
    private String _Name;

    public void set_ID(String id){
        this._ID = id;
    }

    public void set_Name(String name){
        this._Name = name;
    }

    public String get_ID(){
        return _ID;
    }

    public String get_Name(){
        return _Name;
    }

}
