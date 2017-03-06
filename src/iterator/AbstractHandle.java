package iterator;

/**
 * Created by gavin on 2017/3/6.
 * 抽象处理者
 */
public abstract class AbstractHandle {
    /**
     * 下一个节点上的处理对象
     */
    protected AbstractHandle nextHandler;


    public final void handleRequest(AbstractRequest request) {

        if (getHandlerLevel() == request.getRequestLevel()) {

            handle(request);
        } else {

            if (nextHandler != null) {

                nextHandler.handleRequest(request);
            } else {
                System.out.println("All of handler can not handle the request");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     *
     * @return
     */
    protected abstract int getHandlerLevel();


    /**
     * 每个处理着具体的处理方式
     *
     * @param request 请求者的对象
     */
    protected abstract void handle(AbstractRequest request);
}
