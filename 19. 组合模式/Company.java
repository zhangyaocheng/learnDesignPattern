/**
 * 公司抽象类
 * 包含所有的基础功能
 * Add：添加子公司，或者下级部门
 * Remove：移除子公司或者下级部门
 * Display:显示公司结构
 * Duty:职责，显示公司各个部门的职责
 */
public abstract class Company {

    private String name;

    public Company(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void Add(Company company);
    public abstract void Remove(Company company);
    public abstract void Dispaly(int dept);
    public abstract void Duty();

}
