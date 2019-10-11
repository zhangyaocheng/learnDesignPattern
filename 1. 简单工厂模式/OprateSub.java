/**
 * OprateSub 继承Opreta类 实现减法操作
 */
public class OprateSub extends Oprate{

    @Override
    public double getResult(){

        double result = 0;
        result = getNumberA() - getNumberB();
        return result;

    }
}
