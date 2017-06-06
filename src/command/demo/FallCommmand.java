package command.demo;

/**
 * Created by gavin on 2017/6/6.
 */
public class FallCommmand implements Command {
    private TetrisMachine machine;

    public FallCommmand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {

        machine.fastToBottom();
    }
}
