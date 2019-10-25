public class Use20 {

    public static void main(String[] args){

        ConcreateSimpleSet simpleSet = new ConcreateSimpleSet();
        simpleSet.Add("李玲");
        simpleSet.Add("韩梅梅");
        simpleSet.Add("李雷");
        simpleSet.Add("小明");
        simpleSet.Add("小虎");
        simpleSet.Add("奇书网");

        ConcreateIterator iterator = new ConcreateIterator(simpleSet);
        while (!iterator.IsDone()){
            System.out.println("当前检票到:"+iterator.CurrentItem());
            iterator.Next();
        }

    }

}
