package soft2036.Java.week11.JDBC;

/**
 * @ClassName stu
 * @Description TODO
 * @Author csy
 * @Date 2020-11-8
 */

public class Stu {
    private int sid;
    private String sname;
    private String ssex;

    public int getSid() {
        System.out.println(sid);
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                '}';
    }
}
