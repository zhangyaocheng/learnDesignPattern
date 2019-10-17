public class Middler extends Player {

    public Middler(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 "+name+" 进攻");
    }

    @Override
    public void defence() {
        System.out.println("中锋 "+name+" 防守");
    }
}
