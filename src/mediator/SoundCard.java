package mediator;

/**
 * Created by gavin on 2017/6/8.
 * 声卡同事
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("音频 = [" + data + "]");
    }
}
