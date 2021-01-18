package soft2036.Java.week4;

/**
 * @ClassName OtherEmployee
 * @Description TODO
 * @Author msi
 * @Date 2020-10-26
 **/
public class OtherEmployee extends BaseEmployee {
    private String gender;

    public OtherEmployee() {
    }

    public OtherEmployee(String gender) {
        this.gender = gender;
    }

    @Override
    public int getSalary() {
        return "man".equals(this.gender) ? 5000 : 8000;
    }
}
