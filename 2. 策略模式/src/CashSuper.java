/**
 * 金额接口，存放一个函数，实现不用计算总金额方法
 */
public interface CashSuper {

    public double acceptCash(double money);// 计算收取金额的方法，参数为原价，返回的是不同策略返回的价值

}
