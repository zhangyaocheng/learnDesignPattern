/**
 * 国家类
 * 其实就被中介者类管理的各个组件类
 * 这里是一个抽象类
 */
public class Country {

    protected UnitedNations unitedNations;
    public Country(UnitedNations unitedNations){
        this.unitedNations = unitedNations;
    }
}
