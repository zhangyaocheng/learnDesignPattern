/**
 * 使用策略模式而不是简单工厂模式构建解决方案
 */
public class CashContext {

    private CashSuper cashSuper = null;

    public CashContext(String cashType){

        switch (cashType){
            case "一般模式":
                CashSuper c1 = new CashNormal();
                cashSuper = c1;
                break;
            case "打八折":
                CashSuper c2 = new CashRebate(0.8);
                cashSuper = c2;
                break;
            case "满300减200":
                CashSuper c3 = new CashReturn(300,200);
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

}
