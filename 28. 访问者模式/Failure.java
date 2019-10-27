public class Failure extends Action {
    @Override
    public void GetManConclusion(Man man) {
        System.out.println("男人失败时，女人很成功");
    }

    @Override
    public void GetWomanConclusion(Woman woman) {
        System.out.println("女人失败时，男人更失败");
    }
}
