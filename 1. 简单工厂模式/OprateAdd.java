/**
 * OperateAdd 继承Oprate类， 实现加法操作，重写其getResult方法
 *
 * 这里需要使用getNumberA/B()方法获取相关值
 */
public class OprateAdd extends Oprate{

    @Override
    public double getResult(){

        double result = 0;
        result = getNumberA() + getNumberB();
        return result;

    }

}
