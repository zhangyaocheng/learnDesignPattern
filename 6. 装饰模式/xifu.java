/**
 * 西服类，用于给对象穿上西服
 */
public class xifu extends FuShi{

    public void show(){
        System.out.print("西服 ");
        super.show(); // 这里通过使用super.show方法实现对person.show方法的调用

    }
}
