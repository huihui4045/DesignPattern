package interpreter;

/**
 * Created by gavin on 2017/6/6.
 */
public abstract class ArithmeticExpression {
    /******
     * 抽象的解析方法
     * 具体的解析逻辑 有具体的子类实现
     * @return 解析得到的具体的值
     */
    public abstract int interpret();
}
