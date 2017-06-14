package bridge;

/**
 * Created by gavin on 2017/6/14.
 */
public class Client {

    public static void main(String[] args) {

        Implementor a=new ConcreateImplementorA();

        RefinedAbstraction abstraction=new RefinedAbstraction(a);

        abstraction.operation();

        abstraction.refinedOperation();
    }
}
