package soft2036.Java.week10;

public class TicketRun implements Runnable {
    private static int tickets = 10;
    private static Object o = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                synchronized (o) {
                    if (tickets == 0) {
                        System.out.println("票卖光了");
                        System.exit(0);
                    } else {
                        System.out.println(Thread.currentThread().getName() + "卖出一张票，当前票数：" + --tickets);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class TicketRunTest {
    public static void main(String[] args) {
        TicketRun t = new TicketRun();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        thread1.start();
        thread2.start();


    }
}
