package command.demo;

/**
 * Created by gavin on 2017/6/6.
 */
public class TransformCommmand implements Command {
    private TetrisMachine machine;

    public TransformCommmand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {

        machine.transform();
    }
}
