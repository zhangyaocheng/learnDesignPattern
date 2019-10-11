import java.util.Scanner;

/**
 * 主要操作类
 */
public class Main {

    public static void main(String[] args){

        System.out.println("请输入两个数字A，B 以及他们的操作符");
        Scanner in = new Scanner(System.in);
        double numberA = in.nextDouble();
        double numberB = in.nextDouble();
        String operate = in.next();

        Oprate oprate = SimpleOpreteFactory.createOpreta(operate);// 创建操作实例
        oprate.setNumberA(numberA);
        oprate.setNumberB(numberB);
        double result = oprate.getResult(); // 这里的getResult方法在不同类中被分别实现。如果我们需要扩展其他运算符的话可以很方便的继承Oprate类，然后在SimpleOprateFactory工厂中的createOprate方法中添加相关实现即可。
        System.out.println(numberA+" "+operate+" "+numberB+" = "+result);

    }

}
