package xiterator;

/**
 * Created by gavin on 2017/6/6.
 */
public class Client {

    public static void main(String[] args) {

        Aggregate<String> a=new ConcreteAggregate<>();

        for (int i = 0; i < 10; i++) {

            a.add(String.format("三国演义%s",i));
        }

        Iterator<String> iterator = a.iterator();

        while (iterator.hasNext()){

            System.out.printf(""+iterator.next());
        }
    }
}
