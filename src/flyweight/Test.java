package flyweight;

/**
 * Created by gavin on 2017/6/14.
 */
public class Test {

    public static void main(String[] args) {

        Ticket ticket0=TicketFactory.getTicket("北京","青岛");
        ticket0.showTicketInfo("上铺");

        Ticket ticket1=TicketFactory.getTicket("北京","青岛");
        ticket1.showTicketInfo("下铺");

        Ticket ticket2=TicketFactory.getTicket("北京","青岛");
        ticket2.showTicketInfo("中铺");
    }
}
