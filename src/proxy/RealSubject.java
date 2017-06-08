package proxy;

/**
 * Created by gavin on 2017/6/8.
 * 真实主题类
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("Real Subject");
    }
}
