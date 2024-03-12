package Marketing;
import general.Employee;

public class Sales extends Employee {
    public Sales(double empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        double totalEarning = earnings();
        return 0.05 * totalEarning;
    }
}