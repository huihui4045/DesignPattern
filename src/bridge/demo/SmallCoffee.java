package bridge.demo;

/**
 * Created by gavin on 2017/6/14.
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+impl.addSomethine()+"咖啡");
    }
}
