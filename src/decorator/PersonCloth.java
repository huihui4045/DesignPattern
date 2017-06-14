package decorator;

/**
 * Created by gavin on 2017/6/13.
 */
public abstract class PersonCloth extends Person {

    protected Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
