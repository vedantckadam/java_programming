public class Booking
{
    int AvailableSeat=10;
    public synchronized void bookticket(String name,int tickets)
    {
        if(tickets<=AvailableSeat)
        {
            System.out.println(name+"Book Ticket"+tickets+"Tickets");
            AvailableSeat=tickets;
            System.out.println(name+"Booking Done");
            System.out.println("Remaing Tickets Arr"+AvailableSeat);
        }
        else
        {
            System.out.println(name+"CAnnot BOOk Ticket");
        }
    }
}