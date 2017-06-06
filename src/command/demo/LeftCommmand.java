package command.demo;

/**
 * Created by gavin on 2017/6/6.
 */
public class LeftCommmand implements Command {
    private TetrisMachine machine;

    public LeftCommmand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {

        machine.toLeft();
    }
}
