/**
 * 总经理类继承管理类
 */
public class ZongJinLi extends Manager{

    public ZongJinLi(String name){
        super(name);
    }

    @Override
    public void ExecuteApplication(Request request) { // 总经理级别可以处理所有的请求，要么同意，要么不同意
        if (request.getRequest_Type()=="请假"){
            System.out.println(getName()+":"+request.getRequest_Content()+" 数量:"+request.getRequest_num()+"同意");
        }else if (request.getRequest_Type() == "加薪"&&request.getRequest_num()<=500){
            System.out.println(getName()+":"+request.getRequest_Content()+" 数量:"+request.getRequest_num()+"同意");
        }else if (request.getRequest_Type() == "加薪"&&request.getRequest_num()>500){
            System.out.println(getName()+":"+request.getRequest_Content()+" 数量:"+request.getRequest_num()+"再说吧");
        }
    }

}
