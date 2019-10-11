/**
 * 打折收费
 */
public class CashRebate implements CashSuper{

    private double rebate = 1.0;

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
