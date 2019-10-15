public class ConcrateBuilder2 implements Builder {

    private Product product = new Product();

    @Override
    public void buildA() {
        product.Add("X");
    }

    @Override
    public void buildB() {
        product.Add("Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
