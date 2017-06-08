package template;

/**
 * Created by gavin on 2017/6/7.
 *
 * 模板方法模式
 */
public class Test {

    public static void main(String[] args) {

        AbstractComputer computer=new CodeComputer();

        computer.startUp();


        computer=new MilitaryComputer();

        computer.startUp();
    }
}
