/**
 * 游戏角色备忘录
 */
public class RoleMemo {

    private int vlt;
    private int atk;
    private int def;

    public RoleMemo(int vlt, int atk, int def){
        this.vlt = vlt;
        this.atk = atk;
        this.def = def;
    }

    public int getVlt() {
        return vlt;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
