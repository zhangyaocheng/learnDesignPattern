public class Use14 {

    public static void main(String[] args){

        Subject boos = new Boss();
        Observe youxi1 = new youxi("王海洋",boos);
        Observe youxi2 = new youxi("比十三",boos);
        Observe gupiao1 = new GuPiao("方圆",boos);

        boos.Add(youxi1);
        boos.Add(youxi2);
        boos.Add(gupiao1);

        boos.setAction("我胡汉三又回来了！");

        boos.Notify();


    }

}
