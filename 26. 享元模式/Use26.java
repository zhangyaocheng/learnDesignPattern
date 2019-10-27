public class Use26 {

    public static void main(String[] args){

        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.createConcreteWebsite("产品展示");
        website1.use(new User_ForWebsite("小菜"));

        Website website2 = factory.createConcreteWebsite("产品展示");
        website2.use(new User_ForWebsite("小米"));

        Website website3 = factory.createConcreteWebsite("博客");
        website3.use(new User_ForWebsite("小裴"));

        System.out.println("一共有多少个对象："+factory.getCount());

    }

}
