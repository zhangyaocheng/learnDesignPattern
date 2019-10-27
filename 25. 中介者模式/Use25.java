public class Use25 {

    public static void main(String[] args){

        UN_AnLiHui anLiHui = new UN_AnLiHui();
        American american = new American(anLiHui);
        Iraq iraq = new Iraq(anLiHui);

        anLiHui.setAmerican(american);
        anLiHui.setIraq(iraq);

        american.send("伊拉克，你们有核武器，赶快放手");
        iraq.send("我们没有，有种你来看啊！");

    }

}
