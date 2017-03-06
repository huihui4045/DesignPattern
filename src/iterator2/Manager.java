package iterator2;

/**
 * Created by gavin on 2017/3/6.
 */
public class Manager extends Leader {
    @Override
    protected int limit() {
        return 10000;
    }

    @Override
    protected void handle(int money) {

        System.out.printf("经理批复报销：" + money);
    }

    @Override
    protected Leader getNextHandler() {
        return new Boss();
    }
}
