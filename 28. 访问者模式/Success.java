/**
 * 成功类继承行为类
 */
public class Success extends Action {

    @Override
    public void GetManConclusion(Man man) {
        System.out.println("男人成功时背后靠有一个伟大的女人");
    }

    @Override
    public void GetWomanConclusion(Woman woman) {
        System.out.println("女人成功时，背后有一个不成功的男人");
    }
}
