public class Use24 {

    public static void main(String[] args){

        Manager jinli = new JinLi("经历");
        Manager zongjian = new ZongJian("中建");
        Manager zongjinli = new ZongJinLi("宗经理");
        jinli.setSupriorManager(zongjian);
        zongjian.setSupriorManager(zongjinli);

        Request request1 = new Request();
        request1.setRequest_Content("小菜请假");
        request1.setRequest_num(2);
        request1.setRequest_Type("请假");

        Request request2 = new Request();
        request2.setRequest_Type("请假");
        request2.setRequest_Content("小菜请假");
        request2.setRequest_num(4);

        Request request3 = new Request();
        request3.setRequest_Type("请假");
        request3.setRequest_Content("小菜请假");
        request3.setRequest_num(15);

        Request request4 = new Request();
        request4.setRequest_Type("加薪");
        request4.setRequest_Content("小菜加薪");
        request4.setRequest_num(499);

        jinli.ExecuteApplication(request1);
        jinli.ExecuteApplication(request2);
        jinli.ExecuteApplication(request3);
        jinli.ExecuteApplication(request4);

    }

}
