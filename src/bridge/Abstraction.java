package bridge;

/**
 * Created by gavin on 2017/6/14.
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){

        implementor.operationImpl();
    }
}
