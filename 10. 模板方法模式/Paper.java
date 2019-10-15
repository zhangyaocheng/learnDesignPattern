/**
 * 试卷类
 *
 * 其中包括很多试题
 */
public class Paper {

    public void test1(){
        System.out.println("试题1：xxxxx, A. 1, B.2, C.3, D.4");
        System.out.print("答案："+Answer1());
    }

    public String Answer1(){ // 这里通过Answer1方法返回答案，可以在不破坏试题test1/2/3结构的基础上灵活的展示不同不问题的得到
        return "";           // 通过继承体系，可以让不同学生回答问题，给出不同的答案
    }

    public void test2(){
        System.out.println("试题2：xxxxx, A. 1, B.2, C.3, D.4");
        System.out.print("答案："+Answer2());
    }

    public String Answer2(){
        return "";
    }

    public void test3(){
        System.out.println("试题3：xxxxx, A. 1, B.2, C.3, D.4");
        System.out.print("答案："+Answer3());
    }

    public String Answer3(){
        return "";
    }

}
