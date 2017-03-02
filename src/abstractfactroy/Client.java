package abstractfactroy;

/**
 * Created by gavin on 2017/3/2.
 */
public class Client {

    public static void main(String[] args) {

        CarFactory factoryQ3=new Q3Factory();

        factoryQ3.createBrake().brake();
        factoryQ3.createEngine().engine();
        factoryQ3.createTire().tire();
    }




}
