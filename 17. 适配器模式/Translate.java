public class Translate extends Player {

    private ForenMiddlePlaer plaer;

    public Translate(String name) {
        super(name);
        plaer = new ForenMiddlePlaer(name);
    }

    @Override
    public void attack() {
        plaer.jingong();
    }

    @Override
    public void defence() {
        plaer.fangshou();
    }
}
