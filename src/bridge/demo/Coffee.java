package bridge.demo;

/**
 * Created by gavin on 2017/6/14.
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
