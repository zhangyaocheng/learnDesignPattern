/**
 * 经理类继承管理者类
 */
public class JinLi extends Manager {

    public JinLi(String name){
        super(name);
    }

    @Override
    public void ExecuteApplication(Request request) {
        if (request.getRequest_Type()=="请假"&&request.getRequest_num()<=2){
            System.out.println(getName()+":"+request.getRequest_Content()+" 数量:"+request.getRequest_num()+" 批准");
        }else{
            if (supriorManager!=null){
                supriorManager.ExecuteApplication(request);
            }
        }
    }
}
