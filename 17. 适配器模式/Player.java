/**
 * 球员抽象类
 *
 *
 */
public abstract class Player {

    protected String name ;
    public Player(String name){
        this.name = name;
    }

    public abstract void attack(); // 攻击
    public abstract void defence(); // 防守

}
