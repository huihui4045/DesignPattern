package command;

/**
 * Created by gavin on 2017/3/7.
 * 请求类
 */
public class Invoker {

    private Command mCommand;

    public Invoker(Command mCommand) {
        this.mCommand = mCommand;
    }

    public void action() {

        mCommand.execute();
    }
}
