package iterator;

/**
 * Created by gavin on 2017/3/6.
 */
public class Request2 extends AbstractRequest {
    public Request2(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
