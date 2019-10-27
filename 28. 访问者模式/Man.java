public class Man extends Human {
    @Override
    public void Accept(Action action) {

        action.GetManConclusion(this); //这个就是双重分配策略。

    }
}
