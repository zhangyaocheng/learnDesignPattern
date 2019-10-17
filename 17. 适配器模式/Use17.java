public class Use17 {

    public static void main(String[] args){
        Player b = new FrontPlayer("巴蒂尔");
        b.attack();

        Player m = new BackPlayer("麦格雷");
        m.attack();

        Player ym = new Translate("姚明");
        ym.attack();
        ym.defence();

    }

}
