public class Use13 {

    public static void main(String[] args){

        Builder builder = new ConcreteBuild1();
        Builder builder1 = new ConcrateBuilder2();

        Dicorater dicorater = new Dicorater();
        dicorater.createProduct(builder);

        Product product1 = builder.getResult();
        product1.show();

        dicorater.createProduct(builder1);
        Product product2 = builder1.getResult();
        product2.show();
    }

}
