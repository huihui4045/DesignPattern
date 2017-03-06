package iterator2;

/**
 * Created by gavin on 2017/3/6.
 */
public class Director extends Leader {
    @Override
    protected int limit() {
        return 5000;
    }

    @Override
    protected void handle(int money) {

        System.out.printf("主管批复报销：" + money);
    }

    @Override
    protected Leader getNextHandler() {
        return new Manager();
    }
}
