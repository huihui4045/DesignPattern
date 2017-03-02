package factory;

/**
 * Created by gavin on 2017/3/2.
 */
public class Client {

    public static void main(String[] args) {

        Factory factory = new ConcreteFactory();

        Product product = factory.createProduct(ConcreteProductA.class);

        product.method();
    }


}
