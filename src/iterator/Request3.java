package iterator;

/**
 * Created by gavin on 2017/3/6.
 */
public class Request3 extends AbstractRequest {
    public Request3(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
