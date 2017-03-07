package command;

/**
 * Created by gavin on 2017/3/7.
 */
public class ComClient {

    public static void main(String[] args) {

        Receiver receiver=new Receiver();

        Command command=new ConcreteCommand(receiver);

        Invoker invoker=new Invoker(command);

        invoker.action();
    }
}
