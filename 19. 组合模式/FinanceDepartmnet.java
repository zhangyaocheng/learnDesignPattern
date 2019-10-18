/**
 * 财务部
 */
public class FinanceDepartmnet extends Company{

    public FinanceDepartmnet(String name){
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
        System.out.println(getName()+" 公司财务收支管理");
    }
}
