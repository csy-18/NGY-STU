package soft2036.Java.week11;

public class Join implements Runnable{
    private String name;

    public Join(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(name+":"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Join join=new Join("A");
        Thread t1=new Thread(join);
        t1.start();
        for (int i = 0; i < 30; i++) {
            if (i==10){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
