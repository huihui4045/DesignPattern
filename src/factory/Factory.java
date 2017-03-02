package factory;

/**
 * Created by gavin on 2017/3/2.
 * 抽象工厂类
 */
public abstract class Factory {
    /**
     * 抽象工厂方法  具体实现什么由子类实现
     * @return  具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
