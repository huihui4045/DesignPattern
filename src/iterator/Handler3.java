package iterator;

/**
 * Created by gavin on 2017/3/6.
 */
public class Handler3 extends AbstractHandle {
    @Override
    protected int getHandlerLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {

        System.out.println("Handler3 handle request:"+request.getRequestLevel());
    }
}
