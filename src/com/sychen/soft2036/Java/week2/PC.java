package week2;

/**
 * @ClassName PC
 * @Description TODO
 * @Author msi
 * @Date 2020-10-18
 **/
public class PC {
    CPU cpu;
    HardDisk HD;

    public void setCpu(CPU c) {
        this.cpu = c;
    }

    public void setHD(HardDisk h) {
        this.HD = h;
    }

    public void show() {
        System.out.println("cpu:" + cpu.speed);
        System.out.println("disk:" + HD.amount);
    }
}
