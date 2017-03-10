package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by gavin on 2017/3/10.
 */
public class Coder implements Observer{

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("Hi,"+name+", Dev 更新内容了，内容："+arg);
    }

    @Override
    public String toString() {
        return "码农："+name;
    }
}
