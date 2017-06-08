package visitor;

import java.util.Random;

/**
 * Created by gavin on 2017/6/7.
 */
public class Manager extends Staff {


    private int products;

    public Manager(String name) {
        super(name);

        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
