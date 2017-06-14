package bridge;

/**
 * Created by gavin on 2017/6/14.
 */
public class ConcreateImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreateImplementorA");
    }
}
