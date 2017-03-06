package iterator;

/**
 * Created by gavin on 2017/3/6.
 */
public class Handler1 extends AbstractHandle {
    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {

        System.out.println("Handler1 handle request:"+request.getRequestLevel());
    }
}
