package soft2036.Java.week11;

public class ClassRoom implements Runnable{
    Thread stu1,stu2,teacher;

    public ClassRoom() {
        teacher =new Thread();
        stu1=new Thread();
        stu2=new Thread();
        teacher.setName("老师");
        stu1.setName("学生1");
        stu2.setName("学生2");
    }

    @Override
    public void run() {
        if (Thread.currentThread()==stu1){
            try {
                System.out.println(stu1.getName()+"睡十分钟上课");
                Thread.sleep(1000*60*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开始听课");
            stu2.interrupt();
            System.out.println(stu2.getName()+"被吵醒");
        }else if(Thread.currentThread()==stu2){
            try {
                System.out.println(stu2.getName()+"睡一小时上课");
                Thread.sleep(1000*60*60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开始听课");
        }
        else if (Thread.currentThread()==teacher){
            for (int i = 0; i < 3; i++) {
                System.out.println("上课");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            stu1.interrupt();
            System.out.println(stu1.getName()+"被吵醒");
        }
    }

    public static void main(String[] args) {
        ClassRoom classRoom=new ClassRoom();
        classRoom.stu1.start();
        classRoom.stu2.start();
        classRoom.teacher.start();
    }
}
