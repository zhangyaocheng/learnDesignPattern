public class Use8 {

    public static void main(String[] args){

        //这里可能会遇见很多判断
        //单纯使用工厂模式可能会无法很好的解决判断问题
        //使用反射机制可以较好的解决该问题
        //使用反射机制的又是一个新的设计模式了
        IFactory factory = new UndergraduateFactory(); // 创建一个大学生学雷锋对象
        Leifeng student = factory.createLeifent();


        student.buyRice();
        student.sweep();
        student.wash();

    }

}
