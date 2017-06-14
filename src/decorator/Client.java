package decorator;

/**
 * Created by gavin on 2017/6/13.
 * 装饰者模式
 */
public class Client  {

    public static void main(String[] args) {

        Person person=new Boy();

        PersonCloth personCloth=new CheapCloth(person);

        personCloth.dressed();

        ExpensiveCloth expensiveCloth=new ExpensiveCloth(person);

        expensiveCloth.dressed();
    }
}
