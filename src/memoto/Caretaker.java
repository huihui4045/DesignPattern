package memoto;

/**
 * Created by gavin on 2017/3/14.
 */
public class Caretaker {

    Memoto memoto;

    public void archive(Memoto memoto){

        this.memoto=memoto;
    }

    public Memoto getMemoto() {
        return memoto;
    }
}
