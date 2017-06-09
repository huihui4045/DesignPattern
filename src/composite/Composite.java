package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gavin on 2017/6/9.
 * 具体枝干节点
 */
public class Composite extends Component {


    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }


    @Override
    public void doSomething() {

        System.out.println("name:" + name);

        if (components != null) {

            for (Component component : components) {

                component.doSomething();
            }
        }
    }

    public void addChild(Component component){

        components.add(component);
    }

    public void removeChild(Component component){

        components.remove(component);
    }

    public Component getChildren(int index){
        return components.get(index);
    }
}
