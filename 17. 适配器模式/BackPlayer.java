public class BackPlayer extends Player {

    public BackPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫 "+name+" 进攻");
    }

    @Override
    public void defence() {
        System.out.println("后卫 "+name+" 防守");
    }
}
