/**
 * 实现除法操作
 * 注意被除数不能是0
 */
public class OpretaDiv extends Oprate{

    public double getResult(){

        double result = 0;
        double numA = getNumberA();
        double numB = getNumberB();
        try {
            result = numA/numB;
        }catch (ArithmeticException e){
            System.out.println("非法运算错误，被除数不能是0！");
        }
        return result;

    }


}
