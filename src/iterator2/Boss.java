package iterator2;

/**
 * Created by gavin on 2017/3/6.
 */
public class Boss extends Leader {
    @Override
    protected int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected void handle(int money) {

        System.out.printf("老板批复报销："+money);
    }

    @Override
    protected Leader getNextHandler() {
        return null;
    }
}
