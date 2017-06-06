package interpreter;

/**
 * Created by gavin on 2017/6/6.
 * 数字解析器
 */
public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
