/**
 * 简历类：
 * 实现cloneable接口实现clone方法
 */

public class Resume implements Cloneable{

    private String name;
    private int age;
    private String sex;
    private String timeArea;
    private String company;

    public Resume(String name){
        this.name = name;
    }

    public void setPersonalInfo(int age, String sex){
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void dispay(){
        System.out.println("姓名："+name+" 年龄："+age+" 性别:"+sex);
        System.out.println("工作经验: 工作时间:"+timeArea+" 公司名称:"+company);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
