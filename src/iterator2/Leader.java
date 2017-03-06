package iterator2;

/**
 * Created by gavin on 2017/3/6.
 */
public abstract class Leader {

    private Leader nextHandler;

    /**
     * 自身能批复的金额
     *
     * @return
     */
    protected abstract int limit();

    /**
     * 处理财报行为
     *
     * @param money 具体金额
     */
    protected abstract void handle(int money);


    protected abstract Leader getNextHandler();


    public final void handleRequest(int money) {

        if (money < limit()) {

            handle(money);
        } else {

            if (null != (nextHandler = getNextHandler())) {


                nextHandler.handleRequest(money);

            } else {

                System.out.println("没有人能够解决这个任务");
            }
        }
    }


}
