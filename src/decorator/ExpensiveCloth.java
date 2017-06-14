package decorator;

/**
 * Created by gavin on 2017/6/13.
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt() {

        System.out.println("穿件短袖");
    }

    private void dressLeather() {

        System.out.println("穿件皮衣");
    }

    private void dressJean() {

        System.out.println("穿件牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();

        dressShirt();

        dressLeather();

        dressJean();
    }
}
