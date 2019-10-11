/**
 * 主类，使用该方法
 */
public class Use {

    public static void main(String[] args){

        String str1 = "一般模式";
        String str2 = "打八折";
        String str3 = "满300减200";

        CashContext cashContext = new CashContext(str2);
        double result = cashContext.getResult(1000);
        System.out.println("总金额:"+result);

    }

}
