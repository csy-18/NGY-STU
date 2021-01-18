package soft2036.Java.last;

public class WaitAndNotifyDemo{
    //图片是否下载完毕
    public static boolean isFinish = false;
    public static Object object = new Object();
    public static void main(String[] args) throws Exception{
        //下载图片的线程
        final Thread download = new Thread(() -> {
            System.out.println("download:开始下载图片");
            for(int i=0;i<=10;i++){
                System.out.println("download:已完成"+i+"%");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("download:图片下载完毕");
            isFinish = true;//表示图片下载完毕
            synchronized(object){
                //通知object身上的等待的线程解除阻塞
                object.notify();
            }
            System.out.println("download:开始下载附件");
            for(int i=0;i<=10;i++){
                System.out.println("download:已完成"+i+"%");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("download:附件下载完毕");
        });
        download.start();
    }
}