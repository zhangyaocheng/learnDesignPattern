/**
 * 简单工厂类
 *
 * 通过这个类，我们可以非常方便的返回需要的实现类，通过类型转换得到实现类
 */
public class SimpleOpreteFactory {

    public static Oprate createOpreta(String oprate){ // 这里的oprate字符串是指用户在计算中输出的内容 + - * / 等字符

        Oprate oprateInstance = null;
        switch (oprate){

            case "+":
                oprateInstance = new OprateAdd();
                break;
            case "-":
                oprateInstance = new OprateSub();
                break;
            case "*":
                oprateInstance = new OprateMul();
                break;
            case "/":
                oprateInstance = new OpretaDiv();
                break;
        }
        return oprateInstance;

    }

}
