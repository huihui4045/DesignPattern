package command.demo;

/**
 * Created by gavin on 2017/6/6.
 * 接受者角色
 */
public class TetrisMachine implements Function{

    public void toLeft() {

        System.out.printf("向左");
    }

    public void toRight() {

        System.out.printf("向右");
    }

    public void fastToBottom() {

        System.out.printf("快速落下");
    }

    public void transform() {

        System.out.printf("改变形状");
    }
}
