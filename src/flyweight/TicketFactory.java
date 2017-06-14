package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gavin on 2017/6/14.
 */
public class TicketFactory {

    static Map<String, Ticket> mTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {

        String key = String.format("%s-%s", from, to);

        if (mTicketMap.containsKey(key)) {

            System.out.println("使用缓存=====" + key);

            return mTicketMap.get(key);
        } else {

            System.out.println("创建对象=====" + key);

            Ticket ticket = new TrainTicket(from, to);

            mTicketMap.put(key, ticket);

            return ticket;
        }
    }
}
