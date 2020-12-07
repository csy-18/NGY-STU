package week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee marketEmployee = new MarketEmployee("admin");
        marketEmployee.print();
    }

    @Test
    public void getSalary() {
        MarketEmployee marketEmployee = new MarketEmployee("admin");
        int salary = marketEmployee.getSalary();
        assertEquals(3000, salary);

        BaseEmployee baseEmployee = new MarketEmployee("user");
        assertEquals(1000, baseEmployee.getSalary());
    }
}
