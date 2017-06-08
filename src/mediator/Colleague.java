package mediator;

/**
 * Created by gavin on 2017/6/8.
 * 抽象同事
 */
public class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
