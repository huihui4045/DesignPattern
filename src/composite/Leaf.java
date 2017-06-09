package composite;

/**
 * Created by gavin on 2017/6/9.
 * <p>
 * 具体叶子节点
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {

        System.out.println(name);
    }
}
