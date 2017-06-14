package bridge.demo;

/**
 * Created by gavin on 2017/6/14.
 */
public class Test {

    public static void main(String[] args) {
        Ordinary ordinary=new Ordinary();

        Sugar sugar=new Sugar();


        LargeCoffee largeCoffee=new LargeCoffee(ordinary);

        largeCoffee.makeCoffee();

        SmallCoffee smallCoffee=new SmallCoffee(sugar);

        smallCoffee.makeCoffee();
    }
}
