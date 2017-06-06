package interpreter;

/**
 * Created by gavin on 2017/6/6.
 * 解释器模式
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("123 + 123");

        System.out.println(calculator.calcualte());
    }
}
