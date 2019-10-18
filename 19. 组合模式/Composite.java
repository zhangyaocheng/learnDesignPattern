import java.util.ArrayList;
import java.util.List;

/**
 * 子公司或者办事处
 */
public class Composite extends Company{

    private List<Company> list = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void Add(Company company) {
        list.add(company);
    }

    @Override
    public void Remove(Company company) {
        list.remove(company);
    }

    public String show(String str, int dept){

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<dept;i++){
            sb.append(str);
        }
        return sb.toString();

    }

    @Override
    public void Dispaly(int dept) {

        System.out.println(show("-",dept)+getName());
        for (Company company:list){

            company.Dispaly(dept+2);
        }

    }

    @Override
    public void Duty() {

        for (Company company:list){
            company.Duty();
        }

    }
}
