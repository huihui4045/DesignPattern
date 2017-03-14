package memoto;

/**
 * Created by gavin on 2017/3/14.
 */
public class Client {

    public static void main(String[] args) {

        CallOfDuty game=new CallOfDuty();
        game.play();

        Caretaker caretaker=new Caretaker();

        caretaker.archive(game.creatMemote());

        game.quit();


        CallOfDuty newGame=new CallOfDuty();

        newGame.restore(caretaker.getMemoto());
    }
}
