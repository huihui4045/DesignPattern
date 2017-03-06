package iterator2;

/**
 * Created by gavin on 2017/3/6.
 */
public class GroupLeader extends Leader {
    @Override
    protected int limit() {
        return 1000;
    }

    @Override
    protected void handle(int money) {

        System.out.printf("组长批复报销：" + money);
    }

    @Override
    protected Leader getNextHandler() {
        return new Director();
    }
}
