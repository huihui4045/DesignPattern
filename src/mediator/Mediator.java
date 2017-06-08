package mediator;

/**
 * Created by gavin on 2017/6/8.
 * 抽象中介者
 */
public abstract class Mediator {
    /*****
     * 同事对象改变时 通知中介者的方法
     * 在同事对象改变时  又中介者去通知其他对象
     * @param colleague
     */
    public abstract void changed(Colleague colleague);
}
