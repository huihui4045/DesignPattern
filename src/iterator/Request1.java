package iterator;

/**
 * Created by gavin on 2017/3/6.
 */
public class Request1 extends AbstractRequest {
    public Request1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
