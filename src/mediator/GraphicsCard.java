package mediator;

/**
 * Created by gavin on 2017/6/8.
 * 显卡同事
 */
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public  void videoPlay(String data){

        System.out.println("视频： = [" + data + "]");
    }
}
