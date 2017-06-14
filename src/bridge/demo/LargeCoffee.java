package bridge.demo;

/**
 * Created by gavin on 2017/6/14.
 */
public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的"+impl.addSomethine()+"咖啡");
    }
}
