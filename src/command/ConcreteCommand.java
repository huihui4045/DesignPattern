package command;

/**
 * Created by gavin on 2017/3/7.
 * 具体命令类
 */
public class ConcreteCommand implements Command {
    private Receiver mReceiver;//接收者的对象引用

    public ConcreteCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public void execute() {
        /**
         * 调用接收者的相关方法来执行具体的逻辑
         */
        mReceiver.action();
    }
}
