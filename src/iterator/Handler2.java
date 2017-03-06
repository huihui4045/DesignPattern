package iterator;

/**
 * Created by gavin on 2017/3/6.
 */
public class Handler2 extends AbstractHandle {
    @Override
    protected int getHandlerLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {

        System.out.println("Handler2 handle request:"+request.getRequestLevel());
    }
}
