package soft2036.Java.week2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author msi
 * @Date 2020-10-18
 **/
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHD(disk);
        pc.show();
    }
}
