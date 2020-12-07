package soft2036.Java.week10;

public class Ticket extends Thread
{
    private static int tickets = 10;

    @Override
    public void run() {
        int count =tickets;
        for (int i = 0; i < tickets; i++) {

        }
    }
}

class Tickettest
{
    public static void main(String[] args)
    {
        Ticket thread1 = new Ticket();
        Ticket thread2 = new Ticket();
        thread1.start();
        thread2.start();
    }
}