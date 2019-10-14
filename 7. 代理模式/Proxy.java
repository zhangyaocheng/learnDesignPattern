public class Proxy implements GiveGift {

    private Sender sender;
    private String name;

    public Proxy(String name){
        sender = new Sender(name);
    }

    @Override
    public void giveDolls() {
        sender.giveDolls();
    }

    @Override
    public void giveFlowers() {
        sender.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        sender.giveChocolate();
    }
}
