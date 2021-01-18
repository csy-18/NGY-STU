package soft2036.Java.week4;


/**
 * @ClassName MarketEmployee
 * @Description TODO
 * @Author msi
 * @Date 2020-10-26
 **/
public class MarketEmployee extends BaseEmployee {
    private String id;
    public static final String ADMIN = "admin";
    public static final int HIGHER_SALARY = 3000;
    public static final int LOWER_SALARY = 1000;

    @Override
    public void print() {
        super.print();
        System.out.println("this is MarketEmployeeClass");
    }

    public MarketEmployee() {
    }

    public MarketEmployee(String id) {
        this.id = id;
    }

    @Override
    public int getSalary() {
        if (ADMIN.equals(this.id)) {
            return HIGHER_SALARY;
        } else {
            return LOWER_SALARY;
        }
    }
}
