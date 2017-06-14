package decorator;

/**
 * Created by gavin on 2017/6/13.
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    private void dressShorts(){

        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();

        dressShorts();
    }
}
