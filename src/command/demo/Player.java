package command.demo;

/**
 * Created by gavin on 2017/6/6.
 */
public class Player {

    public static void main(String[] args) {

        TetrisMachine machine=new TetrisMachine();

        LeftCommmand leftCommmand=new LeftCommmand(machine);

        RightCommmand rightCommmand=new RightCommmand(machine);

        FallCommmand fallCommmand=new FallCommmand(machine);

        TransformCommmand transformCommmand=new TransformCommmand(machine);

        Buttons buttons=new Buttons();

        buttons.setFallCommmand(fallCommmand);
        buttons.setLeftCommmand(leftCommmand);
        buttons.setRightCommmand(rightCommmand);
        buttons.setTransformCommmand(transformCommmand);


        buttons.toLeft();
        buttons.fastToBottom();
        buttons.transform();

        buttons.toRight();
    }
}
