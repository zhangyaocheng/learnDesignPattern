public class Use19 {

    public static void main(String[] args){

        Company root = new Composite("北京总公司");
        root.Add(new HRDepartment("总公司人力资源部"));
        root.Add(new FinanceDepartmnet("总公司财务部"));

        Company comp = new Composite("上海华东分公司");
        comp.Add(new HRDepartment("华东分公司人力资源部"));
        comp.Add(new FinanceDepartmnet("华东分公司财务部"));

        root.Add(comp);

        Company comp1 = new Composite("南京办事处");
        comp1.Add(new HRDepartment("南京办事处人力资源部"));
        comp1.Add(new FinanceDepartmnet("南京办事处财务部"));

        comp.Add(comp1);

        Company comp2 = new Composite("杭州办事处");
        comp2.Add(new HRDepartment("杭州办事处人力资源部"));
        comp2.Add(new FinanceDepartmnet("杭州办事处财务部"));

        comp.Add(comp2);

        System.out.println("公司结构图");
        root.Dispaly(1);

        System.out.println("公司职责表");
        root.Duty();

    }

}
