public class Sender implements GiveGift {

    private String name;

    public Sender(String name){
        this.name = name;
    }

    @Override
    public void giveDolls() {
        System.out.println(this.name+" 送你洋娃娃!");
    }

    @Override
    public void giveFlowers() {
        System.out.println(this.name+" 送你鲜花!");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.name + " 送你巧克力！");
    }
}
