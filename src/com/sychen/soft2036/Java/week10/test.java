package soft2036.Java.week10;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: liuzujie
 * @Date: 2020/1/16 12:03
 * @Desc: 多个有返回值的线程异步执行
 */
public class test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCall hh = new ThreadCall();
        //例如 新建三个带返回值的多线程来同时处理一件事情，谁先处理完了并且返回true就强制停掉其他线程，再根据处理结果执行后续逻辑
        FutureTask<Boolean> a = new FutureTask<>(hh);
        new Thread(a, "A").start();//开启线程A
        FutureTask<Boolean> b = new FutureTask<>(hh);
        new Thread(b, "B").start();//开启线程B
        FutureTask<Boolean> c = new FutureTask<>(hh);
        new Thread(c, "C").start();//开启线程C
        boolean is = true;
        while (true) {
            if (c.isDone() && is) {
                System.out.println("线程C执行失败了");
                is = false;
            }
            if (c.isDone() && c.get() == true) {
                a.cancel(true);
                b.cancel(true);
                break;
            }
            //get()方法会阻塞主进程，注意判断的位置，先isDone()
            if (a.isDone() && a.get() == true) {
                System.out.println("线程A先执行完了并返回true，关闭其他线程");
                b.cancel(true);
                c.cancel(true);
                break;
            }
            if (b.isDone() && b.get() == true) {
                a.cancel(true);
                c.cancel(true);
                break;
            }

        }
        System.out.println("异步执行结束，你的业务逻辑.....");
    }

    /**
     * 这里我们让三个线程同时输出0-3，看谁先执行完并返回true。
     * **** 提供一种可能的应用场景：比如你有一个字符串需要跟100万个正则去匹配，只要有一个匹配上了就进行其他业务逻辑。
     * ****我们可以采用普通的for循环去匹配，我们也可以把100万个正则分成三份，三个线程同时去匹配那一个字符串。
     */
    static class ThreadCall implements Callable<Boolean> {
        int ia = 0;
        int ib = 0;
        int ic = 0;

        @Override
        public Boolean call() {
            try {
                /*
                 * 程是A：每一次输出sleep 1秒，执行速度第二，执行完且无异常返回true
                 */
                if (Thread.currentThread().getName().equals("A")) {
                    for (; ia < 4; ia++) {
                        System.out.println("A-" + ia);
                        Thread.sleep(1000L);
                    }
                    return true;
                }
                /*
                 * 程是B：每一次输出sleep 2秒，最慢
                 * *****线程A执行完关闭线程B时抛出java.lang.InterruptedException是关闭正在sleep的异常，实际中不会sleep()
                 */
                else if (Thread.currentThread().getName().equals("B")) {
                    for (; ib < 4; ib++) {
                        System.out.println("B-" + ib);
                        Thread.sleep(2000l);
                    }
                    System.out.println("bbb finish");
                    return true;
                }
                /*
                 * 线程C：没sleep执行最快但最后抛出了异常返回false
                 */
                else if (Thread.currentThread().getName().equals("C")) {
                    for (; ic < 4; ic++) {
                        System.out.println("C-" + ic);
                        if (ic == 3) {
                            throw new RuntimeException("线程C执行过程中异常..");
                        }
                    }
                    return true;
                }
            } catch (Exception ex) {
                System.out.printf("线程 " + Thread.currentThread().getName() + "异常:", ex);
            }
            return false;
        }

    }
}