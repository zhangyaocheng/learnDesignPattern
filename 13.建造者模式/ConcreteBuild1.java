public class ConcreteBuild1 implements Builder {

    private Product product = new Product();

    @Override
    public void buildA() {
        product.Add("A");
    }

    @Override
    public void buildB() {
        product.Add("B");;
    }

    @Override
    public Product getResult() {
       return product;
    }
}
