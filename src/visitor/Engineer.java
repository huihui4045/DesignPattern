package visitor;

import java.util.Random;

/**
 * Created by gavin on 2017/6/7.
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }


    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }

    public int getCodeLines() {

        return new Random().nextInt(10 * 1000);
    }
}
