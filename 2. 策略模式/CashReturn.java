/**
 * 返利收费，其实就是不同的收费方案而已
 */
public class CashReturn implements CashSuper{

    private double moneybase = 0;
    private double moneyreturn = 0;


    public CashReturn(double mbase, double mreturn){
        this.moneybase = mbase;
        this.moneyreturn = mreturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money>=moneybase){
            result = money - Math.floor(money/moneybase)*moneyreturn;
        }
        return result;
    }
}
