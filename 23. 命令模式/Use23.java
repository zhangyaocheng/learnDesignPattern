public class Use23 {

    public static void main(String[] args){

        Recivier barbecuer = new Recivier();
        Kaorou kaorou = new Kaorou(barbecuer);
        KaoJiChi kaoJiChi = new KaoJiChi(barbecuer);

        Waiter girle = new Waiter();

        girle.setCommand(kaoJiChi);
        girle.setCommand(kaorou);
        girle.Notify();

    }

}
