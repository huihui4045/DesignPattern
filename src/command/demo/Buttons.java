package command.demo;

/**
 * Created by gavin on 2017/6/6.
 */
public class Buttons implements Function {

    private LeftCommmand leftCommmand;
    private RightCommmand rightCommmand;
    private FallCommmand fallCommmand;
    private TransformCommmand transformCommmand;

    public void setLeftCommmand(LeftCommmand leftCommmand) {
        this.leftCommmand = leftCommmand;
    }

    public void setRightCommmand(RightCommmand rightCommmand) {
        this.rightCommmand = rightCommmand;
    }

    public void setFallCommmand(FallCommmand fallCommmand) {
        this.fallCommmand = fallCommmand;
    }

    public void setTransformCommmand(TransformCommmand transformCommmand) {
        this.transformCommmand = transformCommmand;
    }


    @Override
    public void toLeft() {

        leftCommmand.execute();
    }

    @Override
    public void toRight() {

        rightCommmand.execute();
    }

    @Override
    public void fastToBottom() {

        fallCommmand.execute();
    }

    @Override
    public void transform() {

        transformCommmand.execute();
    }
}
