public class Woman extends Human{
    @Override
    public void Accept(Action action) {
        action.GetWomanConclusion(this);
    }
}
