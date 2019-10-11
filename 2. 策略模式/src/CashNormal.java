/**
 * 使用一般方法计算金额，原样返回价值
 */
public class CashNormal implements CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
