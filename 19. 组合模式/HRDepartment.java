/**
 * 人事部门
 */
public class HRDepartment extends Company{

    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void Add(Company company) {

    }

    @Override
    public void Remove(Company company) {

    }

    @Override
    public void Dispaly(int dept) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<dept;i++){
            sb.append("-");
        }
        System.out.println(sb.toString()+getName());
    }

    @Override
    public void Duty() {
        System.out.println(getName()+" 员工招聘培训管理");
    }
}
