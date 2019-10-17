/**
 * 游戏角色抽象类
 */
public class GameRole {

    private int vlt;//生命力
    private int atk;//攻击力
    private int def;//防御力

    public int getVlt() {
        return vlt;
    }

    public void setVlt(int vlt) {
        this.vlt = vlt;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void InitData(){
        vlt = 100;
        atk = 100;
        def = 100;
    }

    public void AttackBoss(){
        vlt = 0;
        atk = 0;
        def = 0;
    }

    public void setState(RoleMemo memo){
        this.vlt = memo.getVlt();
        this.atk = memo.getAtk();
        this.def = memo.getDef();
    }

    public RoleMemo createMemo(){
        return new RoleMemo(vlt,atk,def);
    }

    public void show(){
        System.out.println("该角色 \n生命力:"+vlt+"\n攻击力:"+atk+"\n防御力:"+def);
    }

}
