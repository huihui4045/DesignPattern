package command.demo;

/**
 * Created by gavin on 2017/6/6.
 */
public class RightCommmand implements Command {
    private TetrisMachine machine;

    public RightCommmand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {

        machine.toRight();
    }
}
