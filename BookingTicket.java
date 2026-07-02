public class BookingTicket extends Thread
{
    Booking booking;
    int Tickets;
    public BookingTicket(Booking booking,String name,int Ticket)
    {
        this.booking=booking;
        this.Tickets=Ticket;
        setName(name);
    }

    public  void run()
    {
        booking.bookticket(getName(), Tickets);
    }

    public static void main(String[] args) {
        Booking booking=new Booking();

        BookingTicket b1=new BookingTicket(booking,"Vedant",4);
        BookingTicket b2=new BookingTicket(booking,"Prasad",5);
        b1.start();
        b2.start();
    }
}