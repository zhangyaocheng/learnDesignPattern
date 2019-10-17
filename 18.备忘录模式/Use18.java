public class Use18 {

    public static void main(String[] args){

        //大战Boos前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.InitData();
        lixiaoyao.show();

        //保存进度
        RoleMemoManager roleMemoManager = new RoleMemoManager();
        roleMemoManager.setRoleMemo(lixiaoyao.createMemo());

        //大战Boos,损耗严重
        lixiaoyao.AttackBoss();
        lixiaoyao.show();

        //恢复之前的状态
        lixiaoyao.setState(roleMemoManager.getRoleMemo());
        lixiaoyao.show();

    }

}
