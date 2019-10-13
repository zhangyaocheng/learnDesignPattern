/**
 * person类
 * 一个基础人对象，用于装饰对象
 */
public class Person {

    private String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("需要装饰的人："+this.name);
    }

}
