package bridge;

/**
 * Created by gavin on 2017/6/14.
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation(){
        System.out.println("refinedOperation");
    }
}
