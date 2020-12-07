package week4;

/**
 * @ClassName BaseEmployee
 * @Description TODO 基础的员工抽象类
 * @Author msi
 * @Date 2020-10-26
 **/
public abstract class BaseEmployee {
    public void print() {
        System.out.println("这是一个抽象类");
    }

    /**
     * 发工资
     *
     * @return int
     */
    public abstract int getSalary();
}
