/**
 * 服饰类
 * 用于装饰人的基类
 */
public class FuShi extends Person{

    protected Person person; // 需要装饰的对象

    public void Decorate(Person person){
        this.person = person; // 装饰对象
    }

    @Override
    public void show(){
        if (person!=null){
            person.show(); // 输出装饰对象的show方法
        }
    }

}
