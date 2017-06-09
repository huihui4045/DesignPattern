package composite;

/**
 * Created by gavin on 2017/6/9.
 * 抽象根节点
 */
public abstract class Component {
    /***
     * 节点的名字
     */
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /****
     * 具体的逻辑方法 有子类实现
     */
    public abstract void doSomething();
}
